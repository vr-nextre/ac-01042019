package it.nextre.iteratore;




import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

public class AppIter {
    public static void main(String[] args) {

        Set<String> l1 = new TreeSet<>();
        SortedSet<String> s1 = new TreeSet<>();

        l1.add("Valerio");
        l1.add("Giovanna");
        l1.add("Simona");
        l1.add("Marco");
        l1.add("Sonia");
        l1.add("Marco");
        l1.add("Anna Gertrude");

        Iterator<String> itSet1 = l1.iterator();

        while(itSet1.hasNext()){
            //itSet1.remove();
            String tmp = itSet1.next();
            System.out.println(tmp);
        }
        //System.out.println(l1.size());
        //System.out.println(l1);


        System.out.println("\n\n\n\n\n\n");

        Map<Integer, String> m1 = new HashMap<>();


        m1.put(24,"Bruno");
        m1.put(23,"Gabriele");
        m1.put(23,"Luana");
        m1.put(22,"Simone");
        m1.put(26,"Marco");
        m1.put(20,"Gabriele");
        m1.put(20,"Ylenia");
        m1.put(27,"Raffaella");
        m1.put(27,"Alessandro");
        m1.put(30,"Yari");
        m1.put(33,"Valerio");


        //Set<Integer> keys = m1.keySet();
        //Iterator<Integer> itm1 = keys.iterator();
        Iterator<Integer> itm1 = m1.keySet().iterator();
        while(itm1.hasNext()){
            Integer tmpK = itm1.next();
            String tmpV = m1.get(tmpK);
            System.out.println("" + tmpK + " - " +tmpV );
        }


        System.out.println("----------------");

        Iterator<Map.Entry<Integer,String>> it = m1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer,String> tmp = it.next();
            System.out.println(tmp.getKey() + " - " + tmp.getValue());
        }


        //Cattivo uso di iterator, SEMPRE tipizzarli quando possibile!
        System.out.println("----------------");

        Iterator it2 = m1.entrySet().iterator();
        while (it2.hasNext()) {
            //Object tmp = it2.next(); //Object non ha metodi getKey e getValue
            //System.out.println(tmp.getKey() + " - " + tmp.getValue());
            Map.Entry tmp = (Map.Entry)it2.next();  //cattivo esempio, ma funziona
            System.out.println(tmp.getKey() + " - " + tmp.getValue() );
        }


        System.out.println("\n\n\n\n------- MAPPA DI MAPPA --------------\n\n\n\n\n");

/*
* esempio
*
*
{
  "code": "P001",
  "title": "Dixxxan Piatti",
  "description": "Detersivo poco bio con aceto",
  "price": 0.88,
  "category": {
    "name": "22%",
    "vat": 22
  }
}
*
*
* */


        Map<String, Object> json = new HashMap<>();
        json.put("code","P001");
        json.put("title","Dixxxan Piatti");
        json.put("description","Detersivo poco bio con aceto");
        json.put("price",0.88);
        Map<String, Object> tmpCat = new HashMap<>();
        tmpCat.put("name", "22%");
        tmpCat.put("vat", 22.0);
        json.put("category",tmpCat);

        //Original Data
        System.out.println("---> MAPPA JAVA");
        System.out.println(json);




        System.out.println("\n\n----- GSON ----- ---------------------------------------");
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        //Gson gson = new Gson();
        //SERIALIZZAZIONE   Da Java Object to JSON/XML/CSV/...
        System.out.println("---> SERIALIZZAZIONE");
        String userJson = gson.toJson(json);
        System.out.println(userJson);



        //DESERIALIZZIONE  Da JSON a Java Object
        System.out.println("---> DESERIALIZZAZIONE");
        String jsonString = "{\"code\":\"P001\",\"price\":0.88,\"description\":\"Detersivo poco bio con aceto\",\"title\":\"Dixxxan Piatti\",\"category\":{\"name\":\"22%\",\"vat\":22.0}}";
        Map<String,Object> jsonObj = new HashMap<>();
        jsonObj = (Map<String,Object>) gson.fromJson(jsonString, json.getClass());
        System.out.println(jsonObj);



        System.out.println("\n\n\n\n\n----- JACKSON ----- ---------------------------------------");

        ObjectMapper mapper = new ObjectMapper();
        String jsonResult = null;
        try {
            jsonResult = mapper.writeValueAsString(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonResult);






    }//end main
}//end class
