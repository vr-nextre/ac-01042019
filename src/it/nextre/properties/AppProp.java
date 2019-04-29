package it.nextre.properties;

import java.io.IOException;
import java.util.Properties;

public class AppProp {

    public static void main(String[] args) throws IOException {

        Properties prop = System.getProperties();
        prop.list(System.out);

        Runtime r = Runtime.getRuntime();
        System.out.println("Available processors: "+r.availableProcessors() );

        String[] params = {" C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg"};
        r.exec("mspaint "+params[0]);

    }//end main

}//end class
