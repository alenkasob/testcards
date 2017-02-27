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
        "payload",
        "response_status",
        "response_info_message"
})
public class MyResponse {

    @JsonProperty("payload")
    private Payload payload;
    @JsonProperty("response_status")
    private String response_status;
    @JsonProperty("response_info_message")
    private String response_info_message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public MyResponse() {
    }

    /**
     *
     * @param responseStatus
     * @param payload
     * @param responseInfoMessage
     */
    public MyResponse(Payload payload, String responseStatus, String responseInfoMessage) {
        super();
        this.payload = payload;
        this.response_status = responseStatus;
        this.response_info_message = responseInfoMessage;
    }

    @JsonProperty("payload")
    public Payload getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public MyResponse withPayload(Payload payload) {
        this.payload = payload;
        return this;
    }

    @JsonProperty("response_status")
    public String getResponse_status() {
        return response_status;
    }

    @JsonProperty("response_status")
    public void setResponse_status(String response_status) {
        this.response_status = response_status;
    }

    public MyResponse withResponseStatus(String responseStatus) {
        this.response_status = responseStatus;
        return this;
    }

    @JsonProperty("response_info_message")
    public String getResponse_info_message() {
        return response_info_message;
    }

    @JsonProperty("response_info_message")
    public void setResponse_info_message(String response_info_message) {
        this.response_info_message = response_info_message;
    }

    public MyResponse withResponseInfoMessage(String responseInfoMessage) {
        this.response_info_message = responseInfoMessage;
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

    public MyResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}