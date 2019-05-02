package it.nextre.properties;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

public class AppFileProp {
    public static void main(String[] args) {

        File f = new File("./custom-data.properties");
        Properties prop = new Properties();

        if (!f.exists())
            createTextFile(f);

        try(Reader fr = new FileReader(f)){
            prop.load(fr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        stampaProp(prop);



        //leggo e inverto il booleano
        boolean active = Boolean.parseBoolean(prop.getProperty("attivo","false"));
        active = !active;
        //aggiornare il valore nelle proprietà
        prop.setProperty("attivo",""+active);


        //leggo l'intero degli aggiornamenti e lo incremento
        int agg = Integer.parseInt(prop.getProperty("aggiornamenti"));
        agg++;
        prop.setProperty("aggiornamenti",""+agg);



        //per le date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(
                //prop.getProperty("update","1970-01-01 00:00:00"),
                prop.getProperty("update",LocalDateTime.now().format(dtf)),
                dtf
        );
        //Random r = new Random();
        //ldt = ldt.withYear(2000+r.nextInt(20));
        //prop.setProperty("update",ldt.format(dtf));
        prop.setProperty("update",ldt.now().format(dtf));




        stampaProp(prop);
        try(Writer fw = new FileWriter(f) ){
            prop.store(fw,"Update by Valerio");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//end main

    private static boolean createTextFile(File newFile){
        try(Writer fw = new FileWriter(newFile)){
            fw.write("");
            fw.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }



    private static void stampaProp(Properties prop){
        Set<String> keys = prop.stringPropertyNames();
        for(String key : keys){
            System.out.println(key + " = " + prop.getProperty(key));
        }
    }

}//end class
