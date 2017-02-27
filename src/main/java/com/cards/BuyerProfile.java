package com.cards;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "avatar_id",
        "email",
        "phone",
        "social_data",
        "storage_data",
        "date_changed"
})
public class BuyerProfile {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("avatar_id")
    private String avatar_id;
    @JsonProperty("email")
    private List<String> email = null;
    @JsonProperty("phone")
    private List<BuyerPhone> phone = null;
    @JsonProperty("social_data")
    private List<SocialData> social_data = null;
    @JsonProperty("storage_data")
    private StorageData storage_data;
    @JsonProperty("date_changed")
    private long date_changed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public BuyerProfile() {
    }

    /**
     *
     * @param id
     * @param storage_data
     * @param phone
     * @param avatar_id
     * @param email
     * @param name
     * @param social_data
     * @param date_changed
     */
    public BuyerProfile(String id, String name, String avatar_id, List<String> email, List<BuyerPhone> phone, List<SocialData> social_data, StorageData storage_data, long date_changed) {
        super();
        this.id = id;
        this.name = name;
        this.avatar_id = avatar_id;
        this.email = email;
        this.phone = phone;
        this.social_data = social_data;
        this.storage_data = storage_data;
        this.date_changed = date_changed;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public BuyerProfile withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public BuyerProfile withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("avatar_id")
    public String getAvatar_id() {
        return avatar_id;
    }

    @JsonProperty("avatar_id")
    public void setAvatar_id(String avatar_id) {
        this.avatar_id = avatar_id;
    }

    public BuyerProfile withAvatarId(String avatarId) {
        this.avatar_id = avatarId;
        return this;
    }

    @JsonProperty("email")
    public List<String> getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(List<String> email) {
        this.email = email;
    }

    public BuyerProfile withEmail(List<String> email) {
        this.email = email;
        return this;
    }

    @JsonProperty("phone")
    public List<BuyerPhone> getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(List<BuyerPhone> phone) {
        this.phone = phone;
    }

    public BuyerProfile withPhone(List<BuyerPhone> phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("social_data")
    public List<SocialData> getSocial_data() {
        return social_data;
    }

    @JsonProperty("social_data")
    public void setSocial_data(List<SocialData> social_data) {
        this.social_data = social_data;
    }

    public BuyerProfile withSocialData(List<SocialData> socialData) {
        this.social_data = socialData;
        return this;
    }

    @JsonProperty("storage_data")
    public StorageData getStorage_data() {
        return storage_data;
    }

    @JsonProperty("storage_data")
    public void setStorage_data(StorageData storage_data) {
        this.storage_data = storage_data;
    }

    public BuyerProfile withStorageData(StorageData storageData) {
        this.storage_data = storageData;
        return this;
    }

    @JsonProperty("date_changed")
    public long getDate_changed() {
        return date_changed;
    }

    @JsonProperty("date_changed")
    public void setDate_changed(long date_changed) {
        this.date_changed = date_changed;
    }

    public BuyerProfile withDateChanged(long dateChanged) {
        this.date_changed = dateChanged;
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

    public BuyerProfile withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}