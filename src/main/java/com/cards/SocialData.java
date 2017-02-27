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
        "id",
        "social_type",
        "social_user_id",
        "social_avatar_id",
        "social_user_name"
})
public class SocialData {

    @JsonProperty("id")
    private String id;
    @JsonProperty("social_type")
    private String social_type;
    @JsonProperty("social_user_id")
    private String socialUserId;
    @JsonProperty("social_avatar_id")
    private String socialAvatarId;
    @JsonProperty("social_user_name")
    private String socialUserName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public SocialData() {
    }

    /**
     *
     * @param socialUserId
     * @param id
     * @param socialUserName
     * @param social_type
     * @param socialAvatarId
     */
    public SocialData(String id, String social_type, String socialUserId, String socialAvatarId, String socialUserName) {
        super();
        this.id = id;
        this.social_type = social_type;
        this.socialUserId = socialUserId;
        this.socialAvatarId = socialAvatarId;
        this.socialUserName = socialUserName;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SocialData withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("social_type")
    public String getSocial_type() {
        return social_type;
    }

    @JsonProperty("social_type")
    public void setSocial_type(String social_type) {
        this.social_type = social_type;
    }

    public SocialData withSocialType(String socialType) {
        this.social_type = socialType;
        return this;
    }

    @JsonProperty("social_user_id")
    public String getSocialUserId() {
        return socialUserId;
    }

    @JsonProperty("social_user_id")
    public void setSocialUserId(String socialUserId) {
        this.socialUserId = socialUserId;
    }

    public SocialData withSocialUserId(String socialUserId) {
        this.socialUserId = socialUserId;
        return this;
    }

    @JsonProperty("social_avatar_id")
    public String getSocialAvatarId() {
        return socialAvatarId;
    }

    @JsonProperty("social_avatar_id")
    public void setSocialAvatarId(String socialAvatarId) {
        this.socialAvatarId = socialAvatarId;
    }

    public SocialData withSocialAvatarId(String socialAvatarId) {
        this.socialAvatarId = socialAvatarId;
        return this;
    }

    @JsonProperty("social_user_name")
    public String getSocialUserName() {
        return socialUserName;
    }

    @JsonProperty("social_user_name")
    public void setSocialUserName(String socialUserName) {
        this.socialUserName = socialUserName;
    }

    public SocialData withSocialUserName(String socialUserName) {
        this.socialUserName = socialUserName;
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

    public SocialData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
