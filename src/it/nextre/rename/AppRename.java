package it.nextre.rename;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * TESTO
 *
 * AQ_[A-Za-z0-9]{5}-VT[0-9]{1,2}.mp4
 *
 * ex: "AQ_gj7Dn-VT6.mp4"
 * ex: "AQ_Px87r-VT28.mp4"
 *
 * STEP1
 * generare 40 file vuoti secondo il pattern sopra mostrato
 *
 * STEP2
 * leggere dalla cartella l'elenco dei file e ordinarli per numero finale
 *
 * STEP3
 * copiare rinominando in ordine i file con nome, seguito dal numero finale (N): "Lezione_"{N}.mp4
 *
 * ex: "Lezione_6.mp4"
 * ex: "Lezione_28.mp4"
 *
 * STEP4
 * a partire da step2 o step3 (libera scelta), nominare i file in modo da avere prima il numero, il pattern " - " e poi il titolo della lezione preso da un indice creato a piacere.
 *
 * ex: "06 - HTML for dummies.mp4"
 * ex: "28 - How to deploy a website.mp4"
 *
 * */

public class AppRename {

    public final static String ORIGIN_FOLDER = new File("/").getAbsolutePath() + "tmpFile"+File.separator ;
    public static final int NUMBER_OF_FILE = 40;

    public static void main(String[] args) {


        File origin = new File(ORIGIN_FOLDER);
        if (!origin.exists()){
            //se non esiste la cartella di origine provo a crearla
            origin.mkdirs();
        }
        if(!origin.canWrite()){
            System.out.println("Non hai i permessi per eseguire il programma");
            System.exit(400);
        }


        AppRename myapp = new AppRename();
        //pulisco i file del precedente avvio
        myapp.cleanDir(new File(ORIGIN_FOLDER));
        System.out.println("Pulizia vecchi file...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(ORIGIN_FOLDER);

        /*
        File f = new File("/");
        File f = new File("a.tmp");
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath());
        System.out.println(Paths.get(f.getAbsolutePath()).getRoot());
        */
        System.out.println("Inizio STEP1");
        myapp.step1();
        System.out.println("Inizio STEP2");
        myapp.step2();
        //myapp.step3();
        //myapp.step4();



    }//end main



    private void step2() {

        List<ElencoOrdinato> elencoFile = new ArrayList<>();
        //  AQ_8gMZT-VT21.mp4
        // {pos=21, filename=AQ_8gMZT-VT21.mp4}

        //comparator e ordinamento
        List<Path> files=new ArrayList<>();
        try {
            files = Files.list(Paths.get(ORIGIN_FOLDER)).collect(Collectors.toList());
            files.sort((item1,item2)-> {
                String path1 = item1.getFileName().toString();
                String num1 = path1.substring(path1.indexOf("-VT") + 3, path1.length() - 4);
                String path2 = item2.getFileName().toString();
                String num2 = path2.substring(path2.indexOf("-VT") + 3, path2.length() - 4);
                return Integer.parseInt(num1) - Integer.parseInt(num2);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0; i<files.size();i++){
            elencoFile.add(new ElencoOrdinato(i,files.get(i).getFileName().toString()));
        }

        //files.forEach(System.out::println);
        elencoFile.forEach(System.out::println);
        System.out.println("FINE STEP2");


    }

    private void step1() {
        for (int i=0;i<NUMBER_OF_FILE;i++){
            String fname = ORIGIN_FOLDER+"AQ_"+randomChar(5)+"-VT"+i+".mp4";
            try(FileWriter fw = new FileWriter(fname)){
                fw.write("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FINE STEP1");
    }

    private String randomChar(int lunghezza) {
        String out="";
        String poolData = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        for(int i = 0; i<lunghezza;i++){
            out+=poolData.charAt(r.nextInt(poolData.length()));
        }
        return out;
    }

    private void cleanDir(File dir) {
        for (File file: dir.listFiles()) {
            if (file.isDirectory())
                cleanDir(file);
            if (file.getAbsolutePath().endsWith(".mp4"))
                file.delete();
        }
    }

}//end class


class ElencoOrdinato {
    int pos;
    String filename;
    public ElencoOrdinato(int pos, String filename) {
        this.pos = pos;
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "ElencoOrdinato{" +
                "pos=" + pos +
                ", filename='" + filename + '\'' +
                '}';
    }
}
