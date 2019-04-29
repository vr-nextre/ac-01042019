package it.nextre.comparazione;


import com.sun.deploy.util.StringUtils;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppDominio {
    /*
    * Ordinare per lunghezza del nome del dominio e nel caso in ordine alfabetico crescente
    * */


    public static void main(String[] args) {

        AppDominio app = new AppDominio();

        List<Sito> sites = new ArrayList<>();
        sites.add(app.new Sito("http://www.msn.com"));
        sites.add(app.new Sito("https://www.xyz.net"));
        sites.add(app.new Sito("https://www.libero.it"));
        sites.add(app.new Sito("https://www.youtube.com"));
        sites.add(app.new Sito("http://www.gmail.com"));
        sites.add(app.new Sito("http://www.email.it"));
        sites.add(app.new Sito("https://www.repubblica.it"));
        sites.add(app.new Sito("https://www.bottogiuseppe.it"));

        for(Sito tmp : sites){
            System.out.println(tmp);
        }

        System.out.println("\n\n-------------------------------\n\n");


        Comparator<Sito> comp1 = new Comparator<Sito>() {
            @Override
            public int compare(Sito s1, Sito s2) {
                if (s1.getNome().length()==s2.getNome().length())
                    return s1.getNome().compareTo(s2.getNome());
                return s1.getNome().length()-s2.getNome().length();
            }
        };

        Collections.sort(sites, comp1);
        sites.forEach(System.out::println);



    }//end main



    class Sito{
        String url;
        String protocollo;
        String nome;
        String dominio;
        String estensione;

        Sito (String url){
            //Shortest site name : http://g.cn
            if (url != null && url.length()>10 && url.startsWith("http")){
                //suppongo un nome valido
                try {
                    URI u = new URI(url);
                    protocollo = u.getScheme();
                    //per il dominio estraggo l'host e ne faccio lo split per "."
                    String[] parts = StringUtils.splitString(u.getHost(),".");
                    if (parts.length>=2)
                        nome = parts[parts.length-2];
                    if (parts.length>=1)
                        estensione=parts[parts.length-1];
                    dominio = nome+"."+estensione;
                    this.url=url;
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }


                /*
                try {
                    URL u2 = new URL(url);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                */


            }else{
                throw new IllegalArgumentException("URL non valido");
            }
        }


        public String getUrl() {
            return url;
        }

        public String getProtocollo() {
            return protocollo;
        }

        public String getNome() {
            return nome;
        }

        public String getDominio() {
            return dominio;
        }

        public String getEstensione() {
            return estensione;
        }

        @Override
        public String toString() {
            return "Sito{" +
                    "url='" + url + '\'' +
                    ", protocollo='" + protocollo + '\'' +
                    ", nome='" + nome + '\'' +
                    ", dominio='" + dominio + '\'' +
                    ", estensione='" + estensione + '\'' +
                    '}';
        }
    }//end Sito





}//end class
