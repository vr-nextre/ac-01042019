package it.nextre.inoutfile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Targa {

    public static void main(String[] args) {

        //generaTargheAuto();
        generaTargheMoto();

    }//end main


    public static void generaTargheMoto() {
        try (FileWriter fw = new FileWriter("targheMoto.txt", true)) {

            char l1 = 'A';
            char l2 = 'A';
            int n = 0;

            String targa = "";

            Map<Long, String> archivio = new TreeMap<>();
            Long pos_archivio = 0L;

            l1:
            for (l1 = 'A'; l1 <= 'Z'; l1++) {
                for (l2 = 'A'; l2 <= 'Z'; l2++) {
                            for (n = 0; n < 100_000; n++) {
                                if (n < 10) {
                                    targa = "" + l1 + l2 + "0000" + n ;
                                } else if (n < 100) {
                                    targa = "" + l1 + l2 + "000" + n ;
                                } else if (n < 1_000) {
                                    targa = "" + l1 + l2 + "00" + n ;
                                }else if (n < 10_000) {
                                    targa = "" + l1 + l2 + "0" + n ;
                                } else {
                                    targa = "" + l1 + l2 + n;
                                }
                                //System.out.println(targa);
                                fw.write(targa + "\n");
                                fw.flush();
                                archivio.put(pos_archivio++, targa);
                            /*
                            //rallentamento ciclo x output in console
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            */

                            }//end for n
                            //break l1; //interruzione di prova

                }//end for l2
            }//end for l1


            //System.out.println(archivio);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void generaTargheAuto() {
        try (FileWriter fw = new FileWriter("targheAuto.txt", true)) {

            char l1 = 'A';
            char l2 = 'A';
            int n = 0;
            char l4 = 'A';
            char l5 = 'A';
            String targa = "";

            Map<Long, String> archivio = new TreeMap<>();
            Long pos_archivio = 0L;

            l1:
            for (l1 = 'A'; l1 <= 'Z'; l1++) {
                for (l2 = 'A'; l2 <= 'Z'; l2++) {
                    for (l4 = 'A'; l4 <= 'Z'; l4++) {
                        for (l5 = 'A'; l5 <= 'Z'; l5++) {
                            for (n = 0; n < 1000; n++) {
                                if (n < 10) {
                                    targa = "" + l1 + l2 + "00" + n + l4 + l5;
                                } else if (n < 100) {
                                    targa = "" + l1 + l2 + "0" + n + l4 + l5;
                                } else {
                                    targa = "" + l1 + l2 + n + l4 + l5;
                                }
                                //System.out.println(targa);
                                fw.write(targa + "\n");
                                archivio.put(pos_archivio++, targa);
                            /*
                            //rallentamento ciclo x output in console
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            */

                            }//end for n
                            //break l1; //interruzione di prova
                        }//end for l5
                    }//end for l4
                }//end for l2
            }//end for l1


            //System.out.println(archivio);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}//end class
