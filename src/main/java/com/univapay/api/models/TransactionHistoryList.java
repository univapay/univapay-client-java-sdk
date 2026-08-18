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
import java.util.UUID;

/**
 * This is a model class for TransactionHistoryList type.
 */
public class TransactionHistoryList {
    private List<TransactionHistoryItem> items;
    private Boolean hasMore;
    private Integer totalHits;
    private UUID nextCursor;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TransactionHistoryList() {
    }

    /**
     * Initialization constructor.
     * @param  items  List of TransactionHistoryItem value for items.
     * @param  hasMore  Boolean value for hasMore.
     * @param  totalHits  Integer value for totalHits.
     * @param  nextCursor  UUID value for nextCursor.
     */
    public TransactionHistoryList(
            List<TransactionHistoryItem> items,
            Boolean hasMore,
            Integer totalHits,
            UUID nextCursor) {
        this.items = items;
        this.hasMore = hasMore;
        this.totalHits = totalHits;
        this.nextCursor = nextCursor;
    }

    /**
     * Getter for Items.
     * List of resources.
     * @return Returns the List of TransactionHistoryItem
     */
    @JsonGetter("items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TransactionHistoryItem> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * List of resources.
     * @param items Value for List of TransactionHistoryItem
     */
    @JsonSetter("items")
    public void setItems(List<TransactionHistoryItem> items) {
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
     * Getter for TotalHits.
     * Total number of matching resources. Present on the first page (no `cursor` supplied) or the
     * last page; absent on intermediate pages while `has_more` is `true`.
     * @return Returns the Integer
     */
    @JsonGetter("total_hits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalHits() {
        return totalHits;
    }

    /**
     * Setter for TotalHits.
     * Total number of matching resources. Present on the first page (no `cursor` supplied) or the
     * last page; absent on intermediate pages while `has_more` is `true`.
     * @param totalHits Value for Integer
     */
    @JsonSetter("total_hits")
    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
    }

    /**
     * Getter for NextCursor.
     * Cursor to pass as `cursor` to fetch the next page. Present only while `has_more` is `true`.
     * @return Returns the UUID
     */
    @JsonGetter("next_cursor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getNextCursor() {
        return nextCursor;
    }

    /**
     * Setter for NextCursor.
     * Cursor to pass as `cursor` to fetch the next page. Present only while `has_more` is `true`.
     * @param nextCursor Value for UUID
     */
    @JsonSetter("next_cursor")
    public void setNextCursor(UUID nextCursor) {
        this.nextCursor = nextCursor;
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
     * Converts this TransactionHistoryList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionHistoryList [" + "items=" + items + ", hasMore=" + hasMore
                + ", totalHits=" + totalHits + ", nextCursor=" + nextCursor
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TransactionHistoryList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionHistoryList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .items(getItems())
                .hasMore(getHasMore())
                .totalHits(getTotalHits())
                .nextCursor(getNextCursor());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionHistoryList}.
     */
    public static class Builder {
        private List<TransactionHistoryItem> items;
        private Boolean hasMore;
        private Integer totalHits;
        private UUID nextCursor;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for items.
         * @param  items  List of TransactionHistoryItem value for items.
         * @return Builder
         */
        public Builder items(List<TransactionHistoryItem> items) {
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
         * Setter for totalHits.
         * @param  totalHits  Integer value for totalHits.
         * @return Builder
         */
        public Builder totalHits(Integer totalHits) {
            this.totalHits = totalHits;
            return this;
        }

        /**
         * Setter for nextCursor.
         * @param  nextCursor  UUID value for nextCursor.
         * @return Builder
         */
        public Builder nextCursor(UUID nextCursor) {
            this.nextCursor = nextCursor;
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
         * Builds a new {@link TransactionHistoryList} object using the set fields.
         * @return {@link TransactionHistoryList}
         */
        public TransactionHistoryList build() {
            TransactionHistoryList model =
                    new TransactionHistoryList(items, hasMore, totalHits, nextCursor);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
