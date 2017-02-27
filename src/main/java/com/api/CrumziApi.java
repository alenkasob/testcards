package com.api;
import com.cards.Payload;
import java.io.IOException;
import java.util.List;

public interface CrumziApi {

    List<com.clients.List> getBuyerCards(String sessionToken) throws IOException;
    Payload getInfoBuyCard(String cartId, String sessionToken) throws IOException;

}
