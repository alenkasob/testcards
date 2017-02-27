package com.cards;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "email"
})
public class BuyerEmail {


        @JsonProperty("email")
        private String email;

        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public BuyerEmail() {
        }

        /**
         *

         * @param email

         */
        public BuyerEmail(String email) {
            super();
            this.email  = email;
        }

        @JsonProperty("email")
        public String getBuyerEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setBuyerEmail(String phone) {
            this.email = email;
        }

        public BuyerEmail withBuyerEmail(String phone) {
            this.email = phone;
            return this;
        }



        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        public BuyerEmail withAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
            return this;
        }

    }

