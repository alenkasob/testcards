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
        "id",
        "card_title",
        "card_type_name",
        "buyer_avatar_id",
        "is_activated",
        "unread_messages_count",
        "date_created",
        "date_changed"
})
public class List {

    @JsonProperty("id")
    private String id;
    @JsonProperty("card_title")
    private String card_title;
    @JsonProperty("card_type_name")
    private String card_type_name;
    @JsonProperty("buyer_avatar_id")
    private String buyer_avatar_id;
    @JsonProperty("is_activated")
    private boolean is_activated;
    @JsonProperty("unread_messages_count")
    private long unread_messages_count;
    @JsonProperty("date_created")
    private long date_created;
    @JsonProperty("date_changed")
    private long date_changed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public List() {
    }

    /**
     *
     * @param id
     * @param isActivated
     * @param cardTitle
     * @param cardTypeName
     * @param dateCreated
     * @param unreadMessagesCount
     * @param buyerAvatarId
     * @param dateChanged
     */
    public List(String id, String cardTitle, String cardTypeName, String buyerAvatarId, boolean isActivated, long unreadMessagesCount, long dateCreated, long dateChanged) {
        super();
        this.id = id;
        this.card_title = cardTitle;
        this.card_type_name = cardTypeName;
        this.buyer_avatar_id = buyerAvatarId;
        this.is_activated = isActivated;
        this.unread_messages_count = unreadMessagesCount;
        this.date_created = dateCreated;
        this.date_changed = dateChanged;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("card_title")
    public String getCard_title() {
        return card_title;
    }

    @JsonProperty("card_title")
    public void setCard_title(String card_title) {
        this.card_title = card_title;
    }

    @JsonProperty("card_type_name")
    public String getCard_type_name() {
        return card_type_name;
    }

    @JsonProperty("card_type_name")
    public void setCard_type_name(String card_type_name) {
        this.card_type_name = card_type_name;
    }

    @JsonProperty("buyer_avatar_id")
    public String getBuyer_avatar_id() {
        return buyer_avatar_id;
    }

    @JsonProperty("buyer_avatar_id")
    public void setBuyer_avatar_id(String buyer_avatar_id) {
        this.buyer_avatar_id = buyer_avatar_id;
    }

    @JsonProperty("is_activated")
    public boolean isIsActivated() {
        return is_activated;
    }

    @JsonProperty("is_activated")
    public void setIsActivated(boolean isActivated) {
        this.is_activated = isActivated;
    }

    @JsonProperty("unread_messages_count")
    public long getUnread_messages_count() {
        return unread_messages_count;
    }

    @JsonProperty("unread_messages_count")
    public void setUnread_messages_count(long unread_messages_count) {
        this.unread_messages_count = unread_messages_count;
    }

    @JsonProperty("date_created")
    public long getDate_created() {
        return date_created;
    }

    @JsonProperty("date_created")
    public void setDate_created(long date_created) {
        this.date_created = date_created;
    }

    @JsonProperty("date_changed")
    public long getDate_changed() {
        return date_changed;
    }

    @JsonProperty("date_changed")
    public void setDate_changed(long date_changed) {
        this.date_changed = date_changed;
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
