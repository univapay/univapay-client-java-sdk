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
 * This is a model class for StoreList type.
 */
public class StoreList {
    private List<StoreListItem> items;
    private Boolean hasMore;
    private Integer totalHits;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public StoreList() {
    }

    /**
     * Initialization constructor.
     * @param  items  List of StoreListItem value for items.
     * @param  hasMore  Boolean value for hasMore.
     * @param  totalHits  Integer value for totalHits.
     */
    public StoreList(
            List<StoreListItem> items,
            Boolean hasMore,
            Integer totalHits) {
        this.items = items;
        this.hasMore = hasMore;
        this.totalHits = totalHits;
    }

    /**
     * Getter for Items.
     * Store rows matching the current filter set.
     * @return Returns the List of StoreListItem
     */
    @JsonGetter("items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<StoreListItem> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * Store rows matching the current filter set.
     * @param items Value for List of StoreListItem
     */
    @JsonSetter("items")
    public void setItems(List<StoreListItem> items) {
        this.items = items;
    }

    /**
     * Getter for HasMore.
     * Whether another page is available.
     * @return Returns the Boolean
     */
    @JsonGetter("has_more")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasMore() {
        return hasMore;
    }

    /**
     * Setter for HasMore.
     * Whether another page is available.
     * @param hasMore Value for Boolean
     */
    @JsonSetter("has_more")
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    /**
     * Getter for TotalHits.
     * Total number of matching stores when available.
     * @return Returns the Integer
     */
    @JsonGetter("total_hits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalHits() {
        return totalHits;
    }

    /**
     * Setter for TotalHits.
     * Total number of matching stores when available.
     * @param totalHits Value for Integer
     */
    @JsonSetter("total_hits")
    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
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
     * Converts this StoreList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "StoreList [" + "items=" + items + ", hasMore=" + hasMore + ", totalHits="
                + totalHits + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link StoreList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link StoreList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .items(getItems())
                .hasMore(getHasMore())
                .totalHits(getTotalHits());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link StoreList}.
     */
    public static class Builder {
        private List<StoreListItem> items;
        private Boolean hasMore;
        private Integer totalHits;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for items.
         * @param  items  List of StoreListItem value for items.
         * @return Builder
         */
        public Builder items(List<StoreListItem> items) {
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
         * Builds a new {@link StoreList} object using the set fields.
         * @return {@link StoreList}
         */
        public StoreList build() {
            StoreList model =
                    new StoreList(items, hasMore, totalHits);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
