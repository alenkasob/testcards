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
        "name",
        "logo_id",
        "background_color",
        "card_rules",
        "date_changed"
})
public class CardType {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("logo_id")
    private String logo_id;
    @JsonProperty("background_color")
    private String background_color;
    @JsonProperty("card_rules")
    private String card_rules;
    @JsonProperty("date_changed")
    private long dateChanged;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public CardType() {
    }

    /**
     *
     * @param id
     * @param background_color
     * @param name
     * @param logo_id
     * @param dateChanged
     * @param card_rules
     */
    public CardType(String id, String name, String logo_id, String background_color, String card_rules, long dateChanged) {
        super();
        this.id = id;
        this.name = name;
        this.logo_id = logo_id;
        this.background_color = background_color;
        this.card_rules = card_rules;
        this.dateChanged = dateChanged;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CardType withId(String id) {
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

    public CardType withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("logo_id")
    public String getLogo_id() {
        return logo_id;
    }

    @JsonProperty("logo_id")
    public void setLogo_id(String logo_id) {
        this.logo_id = logo_id;
    }

    public CardType withLogoId(String logoId) {
        this.logo_id = logoId;
        return this;
    }

    @JsonProperty("background_color")
    public String getBackground_color() {
        return background_color;
    }

    @JsonProperty("background_color")
    public void setBackground_color(String background_color) {
        this.background_color = background_color;
    }

    public CardType withBackgroundColor(String backgroundColor) {
        this.background_color = backgroundColor;
        return this;
    }

    @JsonProperty("card_rules")
    public String getCard_rules() {
        return card_rules;
    }

    @JsonProperty("card_rules")
    public void setCard_rules(String card_rules) {
        this.card_rules = card_rules;
    }

    public CardType withCardRules(String cardRules) {
        this.card_rules = cardRules;
        return this;
    }

    @JsonProperty("date_changed")
    public long getDateChanged() {
        return dateChanged;
    }

    @JsonProperty("date_changed")
    public void setDateChanged(long dateChanged) {
        this.dateChanged = dateChanged;
    }

    public CardType withDateChanged(long dateChanged) {
        this.dateChanged = dateChanged;
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

    public CardType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}