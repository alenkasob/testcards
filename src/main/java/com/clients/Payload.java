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
        "list",
        "cursor"
})
public class Payload {

    @JsonProperty("list")
    private java.util.List<com.clients.List> list = null;
    @JsonProperty("cursor")
    private Cursor cursor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Payload() {
    }

    /**
     *
     * @param cursor
     * @param list
     */
    public Payload(java.util.List<com.clients.List> list, Cursor cursor) {
        super();
        this.list = list;
        this.cursor = cursor;
    }

    @JsonProperty("list")
    public java.util.List<com.clients.List> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<com.clients.List> list) {
        this.list = list;
    }

    @JsonProperty("cursor")
    public Cursor getCursor() {
        return cursor;
    }

    @JsonProperty("cursor")
    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
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

