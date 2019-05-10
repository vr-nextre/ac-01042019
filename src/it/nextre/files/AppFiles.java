package it.nextre.files;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppFiles {

    public static void main(String[] args) {

        Path p = Paths.get("./");

        System.out.println(p.getRoot());
        System.out.println(p.getFileName());
        System.out.println(p.normalize().toString());
        File f = new File("./");
        System.out.println(f.getAbsolutePath());


    }//end main

}//end class
