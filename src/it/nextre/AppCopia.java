package it.nextre;

import it.valix85.AppMain;

public class AppCopia {

    public static void main(String[] args) {


        Persona p3 = new Persona("Lisa","Doncamilleri",1,58000,null);

        Persona p1 = new Persona();
        p1.setNome("Mario");
        p1.setCognome("Rossi");
        p1.setNumero_di_auto(2);
        p1.setSalario(28000);
        p1.setConiuge(p3);

        System.out.println("p1: "+p1);

        Persona p2 = p1; //shallow copy, NO BENE

        //System.out.println(p1==p2);
        p2 = p1.clone();
        //System.out.println(p1==p2);




        System.out.println("p2: "+p2);
        System.out.println("cambio salario a p2");
        p2.setSalario(38000);
        p2.setNome("Luigi");
        p2.getConiuge().setNome("Marisa");

        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);







        int n1 = 3;
        int n2 = 3;
        System.out.println("n1==n2: " + (n1==n2));

        Integer a = 4;
        Integer b = 3; // new Integer(3)
        long c = 3;
        Long d = 3L;
        Number n = 3;
        System.out.println("a==b: " + (a==b));
        System.out.println("a==c: " + (a==c));
        //System.out.println("a==d: " + (a==d));
        System.out.println("a==n: " + (a==n));
        System.out.println("d==c: " + (d==c));
        System.out.println("d==3: " + (d==3));
        //riflessivi per definizione di metodo equals
        //System.out.println(a.equals(n));
        //System.out.println(n.equals(a));
        System.out.println( a instanceof Number );
        System.out.println( n instanceof Short );
        System.out.println(n.getClass());

        System.out.println("---------------------------------");

        String str1 = "Valerio";
        String str2 = "Valerio";
        String str3 = "Vale" + "rio";
        String str4 = ""+"Valerio";
        System.out.println(str1==str2);
        System.out.println(str1== AppMain.strValix);
        System.out.println(str1== new AppMain().strValix2);
        System.out.println(str1==str3);
        System.out.println(str1==AppMain.str3);
        System.out.println(str1==""+str3);    //false (operazioni)
        System.out.println(str1==str3+"");    //false (operazioni)
        System.out.println(str1==null+str3);  //false (operazioni)
        System.out.println(str1==str4);       //true
        System.out.println(str1.equals("Valerio"));       //true
        System.out.println(str1.equals(""+"Valerio"));    //true
        System.out.println(str1.equals(""+str3));         //true





    }//end main

}//end class
