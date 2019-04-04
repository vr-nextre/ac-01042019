package it.nextre;

public class App {
    public static void main(String[] args) {

        byte b = 126;
        b = (byte) (b + 1);
        //b++; // b = (byte)(b+1) post-incremento
        //++b;                    pre-incremento
        System.out.println(++b);


        System.out.println(779);
        System.out.println(0777);
        System.out.println(0b0001_0000);
        System.out.println(0xAB_EF_00);
        System.out.println(1.25e+3);


        System.out.println("----------------------------------------");


        System.out.println(5 / 2.0 * 4 / 2);

        Character cA = 65;
        Character c2 = 33;
        Character c3 = '!';
        System.out.println(cA + c2);
        System.out.println(cA + c3);
        char ca = 65;
        char c4 = '!';
        System.out.println(ca + c4);
        System.out.println((char) (ca + c4));
        System.out.println("\n\t\"\\ " + ca + "" + c4);

        String nome = "Valerio";


        System.out.println("ALFABETO 1");
        for (int k = 0; k < 26; k++) {
            System.out.println((char) ('A' + k));
        }


        System.out.println("ALFABETO 2");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(!(c%2==0)?c:"-");
            System.out.print(c%2==0?c:"-");
            /*
            if(c%2==0)
                System.out.print(c);
            else
                System.out.print("-");
                */
        }
        System.out.println("");


        int n=1;
        pippo: while(n<10){
            if (n%2==0){
                n++;
                continue;
            }
            if (true)break pippo;
            System.out.println("while "+ n++);

        }




        System.exit(500);

        do{
            System.out.println("do-while "+n++);
        }while(n<20);
        System.out.println(n);



    }//end main
}//end class
