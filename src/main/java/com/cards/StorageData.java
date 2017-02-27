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
        "couchdb_db_name",
        "couchdb_db_user",
        "couchdb_db_password"
})
public class StorageData {

    @JsonProperty("couchdb_db_name")
    private String couchdbDbName;
    @JsonProperty("couchdb_db_user")
    private String couchdbDbUser;
    @JsonProperty("couchdb_db_password")
    private String couchdbDbPassword;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public StorageData() {
    }

    /**
     *
     * @param couchdbDbName
     * @param couchdbDbUser
     * @param couchdbDbPassword
     */
    public StorageData(String couchdbDbName, String couchdbDbUser, String couchdbDbPassword) {
        super();
        this.couchdbDbName = couchdbDbName;
        this.couchdbDbUser = couchdbDbUser;
        this.couchdbDbPassword = couchdbDbPassword;
    }

    @JsonProperty("couchdb_db_name")
    public String getCouchdbDbName() {
        return couchdbDbName;
    }

    @JsonProperty("couchdb_db_name")
    public void setCouchdbDbName(String couchdbDbName) {
        this.couchdbDbName = couchdbDbName;
    }

    public StorageData withCouchdbDbName(String couchdbDbName) {
        this.couchdbDbName = couchdbDbName;
        return this;
    }

    @JsonProperty("couchdb_db_user")
    public String getCouchdbDbUser() {
        return couchdbDbUser;
    }

    @JsonProperty("couchdb_db_user")
    public void setCouchdbDbUser(String couchdbDbUser) {
        this.couchdbDbUser = couchdbDbUser;
    }

    public StorageData withCouchdbDbUser(String couchdbDbUser) {
        this.couchdbDbUser = couchdbDbUser;
        return this;
    }

    @JsonProperty("couchdb_db_password")
    public String getCouchdbDbPassword() {
        return couchdbDbPassword;
    }

    @JsonProperty("couchdb_db_password")
    public void setCouchdbDbPassword(String couchdbDbPassword) {
        this.couchdbDbPassword = couchdbDbPassword;
    }

    public StorageData withCouchdbDbPassword(String couchdbDbPassword) {
        this.couchdbDbPassword = couchdbDbPassword;
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

    public StorageData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}