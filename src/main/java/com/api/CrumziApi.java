package com.api;
import com.cards.Payload;
import java.io.IOException;
import java.util.List;

public interface CrumziApi {

    List<com.clients.List> getBuyerCards(String sessionToken, long date_from, long date_to) throws IOException;
    Payload getInfoBuyCard(String cartId, String sessionToken) throws IOException;

}
