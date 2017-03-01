package com.api;

import com.cards.MyResponse;
import com.cards.Payload;
import com.clients.List;
import com.clients.MyClients;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import javax.mail.MessagingException;
import java.io.EOFException;
import java.io.IOException;

// System.out.println(Jr.getPayload().getList().get(0).getCard_title().toString());
// String Status = Jr.getResponse_status();
// if ((Status.split("\\.")[1]) =="200"){}


public class CrumziApiImpl implements CrumziApi {

    public java.util.List<List> getBuyerCards(String sessionToken,long date_from,long date_to ) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        ResponseHandler<String> handler = new BasicResponseHandler();
        ObjectNode request = mapper.createObjectNode();

        HttpPost webshopPost = new HttpPost("http://rest-seller-api.crumzi.com/api/private/cards/seller/getlist");
        StringEntity entity = new StringEntity(request.toString());
        webshopPost.setEntity(entity);

        webshopPost.setHeader("Content-type", "application/json");
        webshopPost.setHeader("Session-Token", sessionToken);
       // "{\"id\":\"" + cartId + "\"}"
        String body = String.format("{\n" +
                "  \"card_type_id\" : null,    \n" +
                "  \"search_string\" : null,    \n" +
                "  \"date_created_from\" : %s,\n" +
                "  \"date_created_to\" : %s,  \n" +
                "  \"cursor\": \n" +
                "  {\n" +
                "    \"page_no\": \"0\",      \n" +
                "    \"page_size\" : \"20\"    \n" +
                "  }\n" +
                "}", date_from, date_to);
        entity = new StringEntity(body);
       webshopPost.setEntity(entity);


        CloseableHttpResponse webshopResponce = httpclient.execute(webshopPost);
        String webshopBody = handler.handleResponse(webshopResponce);
        MyClients Cl = mapper.readValue(webshopBody, MyClients.class);
        if (Integer.parseInt(Cl.getResponseStatus().split("\\.")[1]) == 200){
        return Cl.getPayload().getList();
       }
        else throw new IllegalStateException("resp1 error ");
    }

    public Payload getInfoBuyCard(String cartId, String sessionToken) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        ResponseHandler<String> handler = new BasicResponseHandler();
        ObjectNode request = mapper.createObjectNode();

        HttpPost webshopPost = new HttpPost("http://rest-seller-api.crumzi.com/api/private/cards/seller/get");
        StringEntity entity = new StringEntity(request.toString());
        webshopPost.setEntity(entity);

        webshopPost.setHeader("Content-type", "application/json");
        webshopPost.setHeader("Session-Token", sessionToken);

        entity = new StringEntity("{\"id\":\"" + cartId + "\"}");
        webshopPost.setEntity(entity);

        CloseableHttpResponse webshopResponce = httpclient.execute(webshopPost);
        String webshopBody = handler.handleResponse(webshopResponce);
        MyResponse myresp = mapper.readValue(webshopBody, MyResponse.class);


    if (Integer.parseInt(myresp.getResponse_status().split("\\.")[1]) == 200){
            return myresp.getPayload();
       }
     else throw new IllegalStateException("resp2 error ");




    }
}
