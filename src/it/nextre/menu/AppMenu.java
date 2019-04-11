package it.nextre.menu;

import it.nextre.utils.UserInput;

public class AppMenu {
    public static void main(String[] args) {

        AppMenu app = new AppMenu();

        app.start();

    }//end main

    private void start() {
        int scelta = -1;
        boolean exit=false;

        menu : do{
            stampaMenu();
            scelta = UserInput.leggiInteroPositivo("Inserisci cosa fare (1-9)");
            if(scelta<0 || scelta>9){
                System.out.println("Valore non valido, riprovare");
                continue;
            }

            switch (scelta){
                case 0 : {System.out.println("caso 0");break;}
                case 1 : {System.out.println("caso 1");break;}
                case 2 : {System.out.println("caso 2");break;}
                case 3 : {System.out.println("caso 3");break;}
                case 4 : {System.out.println("caso 4");break;}
                case 5 : {System.out.println("caso 5");break;}
                case 6 : {System.out.println("caso 6");break;}
                case 7 : {System.out.println("caso 7");break;}
                case 8 : {System.out.println("caso 8");break;}
                case 9 : {System.out.println("Bye bye");exit=!exit;break menu;}
            }
            //esco con 3 possibili metodologie
            //1- label sul do, e break il do
            //2- while (scelta!=9)
            //3- while variabile booleana di controllo e SOLO il caso 9 ne inverte il valore

        //}while(true);
        //}while(scelta!=9);
        }while(!exit);


    }

    private void stampaMenu() {
        System.out.println("MY PROG_MENU");
        System.out.println("0 - Azione 0");
        System.out.println("1 - Azione 1");
        System.out.println("2 - Azione 2");
        System.out.println("3 - Azione 3");
        System.out.println("4 - Azione 4");
        System.out.println("5 - Azione 5");
        System.out.println("6 - Azione 6");
        System.out.println("7 - Azione 7");
        System.out.println("8 - Azione 8");
        System.out.println("9 - Esci");
    }
}//end class
