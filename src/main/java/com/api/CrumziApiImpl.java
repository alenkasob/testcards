package com.api;

import com.cards.MyResponse;
import com.cards.Payload;
import com.clients.List;
import com.clients.MyClients;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import java.io.IOException;

// System.out.println(Jr.getPayload().getList().get(0).getCard_title().toString());
// String Status = Jr.getResponse_status();
// if ((Status.split("\\.")[1]) =="200"){}


public class CrumziApiImpl implements CrumziApi {

    public java.util.List<List> getBuyerCards(String sessionToken) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        ResponseHandler<String> handler = new BasicResponseHandler();
        ObjectNode request = mapper.createObjectNode();

        HttpPost webshopPost = new HttpPost("http://rest-seller-api.crumzi.com/api/private/cards/seller/getlist");
        StringEntity entity = new StringEntity(request.toString());
        webshopPost.setEntity(entity);

        webshopPost.setHeader("Content-type", "application/json");
        webshopPost.setHeader("Session-Token", sessionToken);

        CloseableHttpResponse webshopResponce = httpclient.execute(webshopPost);
        String webshopBody = handler.handleResponse(webshopResponce);
        MyClients Cl = mapper.readValue(webshopBody,MyClients.class);
        return Cl.getPayload().getList();
    }

    public Payload getInfoBuyCard(String cartId,String sessionToken) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        ResponseHandler<String> handler = new BasicResponseHandler();
        ObjectNode request = mapper.createObjectNode();

        HttpPost webshopPost = new HttpPost("http://rest-seller-api.crumzi.com/api/private/cards/seller/get");
        StringEntity entity = new StringEntity(request.toString());
        webshopPost.setEntity(entity);

        webshopPost.setHeader("Content-type", "application/json");
        webshopPost.setHeader("Session-Token", sessionToken );

        entity = new StringEntity("{\"id\":\""+cartId+"\"}");
        webshopPost.setEntity(entity);

        CloseableHttpResponse webshopResponce = httpclient.execute(webshopPost);
        String webshopBody = handler.handleResponse(webshopResponce);
        MyResponse myresp = mapper.readValue(webshopBody,MyResponse.class);
        return myresp.getPayload();

}
}
