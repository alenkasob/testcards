package com.cards;

import com.api.CrumziApi;
import com.api.CrumziApiImpl;
import com.csvreader.CsvWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonReader {

    private static String TOKEN = "eyJhbGciOiJIUzUxMiJ9.eyJUT0tFTl9UWVBFIjoiU0VTU0lPTiIsIkFQUExJQ0FUSU9OX1RZUEUiOiJTRUxMRVIiLCJVU0VSX0lEIjoiMmM5ZjkxZjQ1OWFjZWYwZjAxNTliMTQzNmIzYjAwMDQiLCJpc3MiOiJDUlVNWkkiLCJpYXQiOjE0ODQ3Mzk0NTF9.sbYrTc2k54zCWhepAlNxeEgyIYYN3ko4Zg23RTdNhrART4fL_bgVCdN6rmR7tzsJILrjIyJZcJ3k5_RlnG7DvQ";

    public static void main(String[] args) throws IOException {
        JsonReader J = new JsonReader();
        J.process();
    }








    void process() throws IOException {
        CrumziApi api = new CrumziApiImpl();
        List<com.clients.List> cards = api.getBuyerCards(TOKEN);
        //while (!cards.isEmpty()) {
            for (com.clients.List card : cards) {
                Payload payload = api.getInfoBuyCard(card.getId(), TOKEN);

                /*JSONArray array = new JSONArray(Arrays.asList(payload));
                System.out.println(array.toString(cards.indexOf(card))); //pretty print with indent

                String csv = CDL.toString(array);
                System.out.println(csv); //csv */

                StringBuilder sb = new StringBuilder();
               // sb.append("phone_number;barcode;seller_descr;is_activated;date_created;buyer_profile_name");
                sb.append((payload.getPhone_number())==null ? ";": (payload.getPhone_number()+ ";")) ;
                sb.append((payload.getBarcode()) ==null ? ";" : (payload.getBarcode()+";"));
               // System.out.println((payload.getBuyer_profile().getName()));
               // sb.append((((payload.getBuyer_profile().getName()) ==null) || ((payload.getBuyer_profile().getName()).equals("") )) ? ";" : (payload.getBuyer_profile().getName()+ ";"));
                sb.append(payload.isIsActivated()+";");
                sb.append(payload.getDate_created()+ ";");
               // sb.append((payload.getBuyer_profile().getName()) ==null ? ";" : (payload.getBuyer_profile().getName()+ ";"));
                //sb.append("\n");
                System.out.println(sb.toString());

                String outputFile = "D:\\output.csv";

                boolean alreadyExists = new File(outputFile).exists();

                try {
                    // use FileWriter constructor that specifies open for appending
                    CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

                    // if the file didn't already exist then we need to write out the header line
                    if (!alreadyExists)
                    {
                        csvOutput.write("phone_number;barcode;seller_descr;is_activated;date_created;buyer_profile_name");
                        csvOutput.endRecord();
                    }

                    csvOutput.write(sb.toString());
                    csvOutput.endRecord();

                    csvOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }




            }

            cards = api.getBuyerCards(TOKEN);

        //}


    }
}