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
        "page_no",
        "page_size",
        "is_more_exists"
})
public class Cursor {

    @JsonProperty("page_no")
    private long page_no;
    @JsonProperty("page_size")
    private long page_size;
    @JsonProperty("is_more_exists")
    private boolean is_more_exists;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Cursor() {
    }

    /**
     *
     * @param isMoreExists
     * @param pageNo
     * @param pageSize
     */
    public Cursor(long pageNo, long pageSize, boolean isMoreExists) {
        super();
        this.page_no = pageNo;
        this.page_size = pageSize;
        this.is_more_exists = isMoreExists;
    }

    @JsonProperty("page_no")
    public long getPage_no() {
        return page_no;
    }

    @JsonProperty("page_no")
    public void setPage_no(long page_no) {
        this.page_no = page_no;
    }

    @JsonProperty("page_size")
    public long getPage_size() {
        return page_size;
    }

    @JsonProperty("page_size")
    public void setPage_size(long page_size) {
        this.page_size = page_size;
    }

    @JsonProperty("is_more_exists")
    public boolean isIsMoreExists() {
        return is_more_exists;
    }

    @JsonProperty("is_more_exists")
    public void setIsMoreExists(boolean isMoreExists) {
        this.is_more_exists = isMoreExists;
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
