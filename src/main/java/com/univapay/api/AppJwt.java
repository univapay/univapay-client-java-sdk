/*
 * Hand-authored SDK extension kept OUTSIDE the generated files.
 *
 * APIMatic regenerates the client and the Api classes on every build, so any
 * logic injected into those files risks a merge conflict whenever the spec
 * changes nearby. Keeping the decoding here -- in a file APIMatic never
 * generates -- means regeneration can never conflict with it. The generated
 * client only delegates to the two helpers below.
 */

package com.univapay.api;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * Reads the context a UnivaPay app token was issued for out of its JWT.
 *
 * <p>A store-level app token carries both a {@code merchant_id} and a
 * {@code store_id} claim; a merchant-level token carries only
 * {@code merchant_id}.
 *
 * <p>Decoding only reads the payload segment -- it does <strong>not</strong>
 * verify the signature, which is deliberate. The value is the caller's own
 * credential, already trusted by virtue of being configured on the client;
 * nothing here is an authorization decision. Never use these values to
 * authenticate a third party's token.
 */
public final class AppJwt {

    /**
     * Matches the canonical 8-4-4-4-12 hexadecimal UUID form.
     *
     * <p>{@link UUID#fromString} is far more lenient than the canonical form --
     * it accepts short groups such as {@code 1-1-1-1-1} -- so the claim is
     * pattern-checked before being parsed.
     */
    private static final Pattern UUID_PATTERN = Pattern.compile(
            "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");

    private AppJwt() {
    }

    /**
     * Decodes the payload segment of a JWT without verifying its signature.
     *
     * @param  jwtToken The JWT to decode; may be null.
     * @return The payload as a claim map, or null unless the token is a
     *         well-formed three-segment JWT whose payload segment is
     *         base64url-encoded JSON describing an object.
     */
    public static Map<String, Object> decodePayload(String jwtToken) {
        if (jwtToken == null || jwtToken.isEmpty()) {
            return null;
        }
        String[] segments = jwtToken.split("\\.", -1);
        if (segments.length != 3) {
            return null;
        }
        String json;
        try {
            json = new String(Base64.getUrlDecoder().decode(segments[1]),
                    StandardCharsets.UTF_8);
        } catch (IllegalArgumentException e) {
            return null;
        }
        try {
            // ApiHelper.deserialize(String) yields a LinkedHashMap of the JSON
            // object, so no JSON dependency is named here directly.
            return ApiHelper.deserialize(json);
        } catch (IOException | RuntimeException e) {
            return null;
        }
    }

    /**
     * Reads a claim from a JWT payload and returns it only if it is a UUID.
     *
     * <p>Anything else -- claim absent, null, not a string, or a string that is
     * not a canonical UUID -- yields null, so a caller never has to distinguish
     * "not set" from "could not decode".
     *
     * @param  jwtToken The JWT to decode; may be null.
     * @param  claim    Name of the claim to read.
     * @return The claim value as a {@link UUID}, or null.
     */
    public static UUID readUuidClaim(String jwtToken, String claim) {
        Map<String, Object> payload = decodePayload(jwtToken);
        if (payload == null) {
            return null;
        }
        Object value = payload.get(claim);
        if (!(value instanceof String)
                || !UUID_PATTERN.matcher((String) value).matches()) {
            return null;
        }
        return UUID.fromString((String) value);
    }

    /**
     * Asserts that a store id was resolvable from the configured app token.
     *
     * <p>Used by the store-scoped convenience calls on the client, which take no
     * storeId argument. It lives here, beside the claim reader, so the message
     * stays in a file APIMATIC never regenerates.
     *
     * <p>The message deliberately says nothing about the token itself: the
     * credential and its claims must never reach an error message or a log. A
     * merchant-level token arriving here is not a broken token -- it is simply
     * not scoped to a store.
     *
     * @param  storeId The store id read from the token, or null when it carries none.
     * @return storeId, when it is present.
     * @throws IllegalStateException when storeId is null.
     */
    public static UUID requireStoreId(UUID storeId) {
        if (storeId == null) {
            throw new IllegalStateException(
                    "getCharge(chargeId) requires a store-level App Token: the configured token "
                    + "carries no usable \"store_id\" claim. Use a store-level App Token, or call "
                    + "getCharge(storeId, chargeId) on ChargesApi with an explicit store id.");
        }
        return storeId;
    }
}
