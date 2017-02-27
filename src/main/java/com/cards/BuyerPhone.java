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
            "phone",
            "is_verified"
    })
    public class BuyerPhone {

        @JsonProperty("phone")
        private String phone;
        @JsonProperty("is_verified")
        private boolean is_verified;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         *
         */
        public BuyerPhone() {
        }

        /**
         *
         * @param is_verified
         * @param phone
         */
        public BuyerPhone(String phone, boolean is_verified) {
            super();
            this.phone = phone;
            this.is_verified = is_verified;
        }

        @JsonProperty("phone")
        public String getPhone() {
            return phone;
        }

        @JsonProperty("phone")
        public void setPhone(String phone) {
            this.phone = phone;
        }

        public BuyerPhone withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        @JsonProperty("is_verified")
        public boolean isIsVerified() {
            return is_verified;
        }

        @JsonProperty("is_verified")
        public void setIsVerified(boolean isVerified) {
            this.is_verified = isVerified;
        }

        public BuyerPhone withIsVerified(boolean isVerified) {
            this.is_verified = isVerified;
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

        public BuyerPhone withAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
            return this;
        }

    }

