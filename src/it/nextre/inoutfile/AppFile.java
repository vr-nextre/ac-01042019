package it.nextre.inoutfile;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AppFile {

    public static void main(String[] args) {










        File fout = new File("text.txt");


        try(FileWriter fw = new FileWriter("test.txt", true);
            FileReader fr = new FileReader("test.txt")
            //OutputStream os = new FileOutputStream(fout);
            //OutputStreamWriter osw = new OutputStreamWriter(os)
        ){

            //int x = fr.read();
            //System.out.println(x);
            if (fr.read()==-1) { //fine dello stream
                fw.write("riga n");
            }else{
                fw.write("\nriga n");
            }

            System.out.println("blocco nel try-with-resource");
            Scanner s = new Scanner(System.in);
            s.nextLine();
            //fw.close(); //automatico per via del try-with-resource
        }catch (Exception e){
            //fw.close(); //non esiste fw
        }
        finally {
            //fw.close(); //non esiste fw
        }


        System.out.println("blocco fuori try-with-resource");

        Scanner s = new Scanner(System.in);
        s.nextLine();





















    }//end main

}//end class
