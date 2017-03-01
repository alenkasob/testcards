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
        "phone_number",
        "card_type",
        "barcode",
        "barcode_type",
        "seller_descr",
        "is_activated",
        "buyer_profile",
        "date_created",
        "date_changed"
})
public class Payload {

    @JsonProperty("id")
    private String id;
    @JsonProperty("phone_number")
    private String phone_number;
    @JsonProperty("card_type")
    private CardType card_type;
    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("barcode_type")
    private String barcode_type;



    @JsonProperty("seller_descr")
    private String seller_descr;
    @JsonProperty("is_activated")
    private boolean is_activated;
    @JsonProperty("buyer_profile")
    private BuyerProfile buyer_profile;
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
    public Payload() {
    }

    /**
     *
     * @param id
     * @param is_activated
     * @param phone_number
     * @param buyer_profile
     * @param date_created
     * @param barcode
     * @param barcode_type
     * @param seller_descr
     * @param card_type
     * @param date_changed
     */
    public Payload(String id, String phone_number, CardType card_type, String barcode, String barcode_type, String seller_descr, boolean is_activated, BuyerProfile buyer_profile, long date_created, long date_changed) {
        super();
        this.id = id;
        this.phone_number = phone_number;
        this.card_type = card_type;
        this.barcode = barcode;
        this.barcode_type = barcode_type;
        this.seller_descr = seller_descr;
        this.is_activated = is_activated;
        this.buyer_profile = buyer_profile;
        this.date_created = date_created;
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

    public Payload withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("phone_number")
    public String getPhone_number() {
        return phone_number;
    }

    @JsonProperty("phone_number")
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Payload withPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
        return this;
    }

    @JsonProperty("card_type")
    public CardType getCard_type() {
        return card_type;
    }

    @JsonProperty("card_type")
    public void setCard_type(CardType card_type) {
        this.card_type = card_type;
    }

    public Payload withCardType(CardType cardType) {
        this.card_type = cardType;
        return this;
    }

    @JsonProperty("barcode")
    public String getBarcode() {
        return barcode;
    }

    @JsonProperty("barcode")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Payload withBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    @JsonProperty("barcode_type")
    public String getBarcode_type() {
        return barcode_type;
    }



    @JsonProperty("barcode_type")
    public void setBarcode_type(String barcode_type) {
        this.barcode_type = barcode_type;
    }

    public Payload withBarcodeType(String barcodeType) {
        this.barcode_type = barcodeType;
        return this;
    }
    public String getSeller_descr() {
        return seller_descr;
    }

    public void setSeller_descr(String seller_descr) {
        this.seller_descr = seller_descr;
    }


    @JsonProperty("is_activated")
    public boolean isIsActivated() {
        return is_activated;
    }

    @JsonProperty("is_activated")
    public void setIsActivated(boolean isActivated) {
        this.is_activated = isActivated;
    }

    public Payload withIsActivated(boolean isActivated) {
        this.is_activated = isActivated;
        return this;
    }

    @JsonProperty("buyer_profile")
    public BuyerProfile getBuyer_profile() {
        return buyer_profile;
    }

    @JsonProperty("buyer_profile")
    public void setBuyer_profile(BuyerProfile buyer_profile) {
        this.buyer_profile = buyer_profile;
    }

    public Payload withBuyerProfile(BuyerProfile buyerProfile) {
        this.buyer_profile = buyerProfile;
        return this;
    }

    @JsonProperty("date_created")
    public long getDate_created() {
        return date_created;
    }

    @JsonProperty("date_created")
    public void setDate_created(long date_created) {
        this.date_created = date_created;
    }

    public Payload withDateCreated(long dateCreated) {
        this.date_created = dateCreated;
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

    public Payload withDateChanged(long dateChanged) {
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

    public Payload withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}