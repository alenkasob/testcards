package com.clients;

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
public class MyClients {

    @JsonProperty("payload")
    private com.clients.Payload payload;
    @JsonProperty("response_status")
    private String responseStatus;
    @JsonProperty("response_info_message")
    private String responseInfoMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public MyClients() {
    }

    /**
     *
     * @param responseStatus
     * @param payload
     * @param responseInfoMessage
     */
    public MyClients(com.clients.Payload payload, String responseStatus, String responseInfoMessage) {
        super();
        this.payload = payload;
        this.responseStatus = responseStatus;
        this.responseInfoMessage = responseInfoMessage;
    }

    @JsonProperty("payload")
    public com.clients.Payload getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(com.clients.Payload payload) {
        this.payload = payload;
    }

    @JsonProperty("response_status")
    public String getResponseStatus() {
        return responseStatus;
    }

    @JsonProperty("response_status")
    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    @JsonProperty("response_info_message")
    public String getResponseInfoMessage() {
        return responseInfoMessage;
    }

    @JsonProperty("response_info_message")
    public void setResponseInfoMessage(String responseInfoMessage) {
        this.responseInfoMessage = responseInfoMessage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
