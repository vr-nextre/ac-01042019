package it.nextre.strategypattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppPaninoStrategy {
    public static void main(String[] args) {

        List<Cuoco> cuochi = new ArrayList<>();
        Context c = new Context();  //Cucina
        Cuoco c1 = new CuocoAmericano();
        Cuoco c2 = new CuocoItaliano();
        Cuoco c3 = new CuocoTurco();
        Cuoco c4 = new CuocoFrancese();
        Cuoco c5 = new CuocoSpagnolo();
        cuochi.add(c1);
        cuochi.add(c2);
        cuochi.add(c3);
        cuochi.add(c4);
        cuochi.add(c5);
        Random r = new Random();
        for(int i = 0; i < 5; i++) {
            //Strategy scelta randomicamente
            System.out.println(c.getPanino(cuochi.get(r.nextInt(cuochi.size()))));
        }
    }//end main
}//end class
