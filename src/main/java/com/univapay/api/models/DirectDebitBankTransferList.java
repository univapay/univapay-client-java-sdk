/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for DirectDebitBankTransferList type.
 */
public class DirectDebitBankTransferList {
    private List<DirectDebitBankTransfer> items;
    private Boolean hasMore;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public DirectDebitBankTransferList() {
    }

    /**
     * Initialization constructor.
     * @param  items  List of DirectDebitBankTransfer value for items.
     * @param  hasMore  Boolean value for hasMore.
     */
    public DirectDebitBankTransferList(
            List<DirectDebitBankTransfer> items,
            Boolean hasMore) {
        this.items = items;
        this.hasMore = hasMore;
    }

    /**
     * Getter for Items.
     * List of resources.
     * @return Returns the List of DirectDebitBankTransfer
     */
    @JsonGetter("items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DirectDebitBankTransfer> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * List of resources.
     * @param items Value for List of DirectDebitBankTransfer
     */
    @JsonSetter("items")
    public void setItems(List<DirectDebitBankTransfer> items) {
        this.items = items;
    }

    /**
     * Getter for HasMore.
     * Whether more results are available.
     * @return Returns the Boolean
     */
    @JsonGetter("has_more")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasMore() {
        return hasMore;
    }

    /**
     * Setter for HasMore.
     * Whether more results are available.
     * @param hasMore Value for Boolean
     */
    @JsonSetter("has_more")
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    /**
     * Hidden method for the serialization of additional properties.
     * @return The map of additionally set properties.
     */
    @JsonAnyGetter
    private Map<String, Object> getAdditionalProperties() {
        return additionalProperties.getAdditionalProperties();
    }

    /**
     * Hidden method for the de-serialization of additional properties.
     * @param name The name of the additional property.
     * @param value The Object value of the additional property.
     */
    @JsonAnySetter
    private void setAdditionalProperties(String name, Object value) {
        additionalProperties.setAdditionalProperty(name,
                ConversionHelper.convertToSimpleType(value,
                        x -> x),
                true);
    }

    /**
     * Getter for the value of additional properties based on provided property name.
     * @param name The name of the additional property.
     * @return Either the Object property value or null if not exist.
     */
    
    public Object getAdditionalProperty(String name) {
        return additionalProperties.getAdditionalProperty(name);
    }

    /**
     * Converts this DirectDebitBankTransferList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirectDebitBankTransferList [" + "items=" + items + ", hasMore=" + hasMore
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link DirectDebitBankTransferList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirectDebitBankTransferList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .items(getItems())
                .hasMore(getHasMore());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link DirectDebitBankTransferList}.
     */
    public static class Builder {
        private List<DirectDebitBankTransfer> items;
        private Boolean hasMore;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for items.
         * @param  items  List of DirectDebitBankTransfer value for items.
         * @return Builder
         */
        public Builder items(List<DirectDebitBankTransfer> items) {
            this.items = items;
            return this;
        }

        /**
         * Setter for hasMore.
         * @param  hasMore  Boolean value for hasMore.
         * @return Builder
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * Setter for additional property that are not in model fields.
         * @param name The name of the additional property.
         * @param value The Object value of the additional property.
         * @return Builder.
         */
        public Builder additionalProperty(String name, Object value) {
            this.additionalProperties.setAdditionalProperty(name, value);
            return this;
        }

        /**
         * Builds a new {@link DirectDebitBankTransferList} object using the set fields.
         * @return {@link DirectDebitBankTransferList}
         */
        public DirectDebitBankTransferList build() {
            DirectDebitBankTransferList model =
                    new DirectDebitBankTransferList(items, hasMore);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
