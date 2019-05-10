package it.nextre.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppLambda {

    private static Random r = new Random();

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Pino");
        names.add("Mario");
        names.add("Luigi");
        names.add("Peach");
        names.add("Waluigi");
        names.add("Wario");
        names.add("Toad");
        names.add("Federica");
        names.add("Daisy");
        names.add("Margherita");
        names.add("Qui");
        names.add("Mi");
        names.add("Yaghi");
        names.add("Quo");
        names.add("Qua");

        int cont = 0;

        Predicate<String> p = el -> el.length() > 3;
        //Consumer<String> c = el-> System.out.println(el);
        Consumer<String> c = System.out::println;
        //Function<String,Integer> f1 = el->el.length();
        Function<String,Integer> f1 = String::length;
        //UnaryOperator<String> upper = el->el.toUpperCase();
        UnaryOperator<String> upper2 = String::toUpperCase;


        Supplier<String> newName = ()->names.get(r.nextInt(names.size()));
        Supplier<String> anonimName = new Supplier<String>() {
            @Override
            public String get() {
                return names.get(r.nextInt(names.size()));
            }
        };



        //Stream<String> s1 =
        //COMPOSIZIONE DELLO STREAM (* obbligatori)
        //*SORGENTE (names)
        //[OPERAZIONI INTERMEDIE]
        //*TERMINATORE (forEach)
        names
                .stream()
                .filter(p)
                //.peek(c)
                .filter(item -> item.length() > 5)
                //.peek(c)
                .map(el->{
                    el="*** "+el.toUpperCase()+" ***";
                    return el;
                })
                .forEach(el -> System.out.println("NOME: " + el));

        //s1.forEach(el -> System.out.println("NOME: " + el));


        System.out.println("----------- vince la gara ---------");

        class Cont {
            private int k=0;
            public void addOne(){k++;}
            public int get(){return k;}
        }
        Cont c1 = new Cont();

        Stream.generate(newName)
                //.peek(e->cont++)  //bad solo oggetti FINAL
                .peek(e->c1.addOne())       //PROGRAMMAZIONE FUNZIONALE IMPURA
                .filter(e->e.length()>4)
                .findFirst()
                //.ifPresent(System.out::println);
                .ifPresent(e->System.out.println(e+" dopo "+c1.get()+" tentativi"));

        System.out.println("\n\n\n----------- vincono la corsa ---------");

        Stream.generate(newName)
                .peek(e-> System.out.println("Generato randomicamente: "+e))
                .filter(e->e.length()>6)
                .limit(3)   //limita il numero di risultati dallo stream
                .forEach(System.out::println);


        System.out.println("\n\n\n------------ DADO ------------");
        Supplier<Integer> newDado = ()->1+r.nextInt(6);

        Stream<Integer> tiro = Stream.generate(newDado).limit(1);
        //tiro.forEach(System.out::println);
        List<Integer>lanci = tiro.collect(Collectors.toList());
        System.out.println(lanci.get(0));


        System.out.println("\n\n\n------------ TESTA O CROCE ------------");
        Supplier<Boolean> newMoneta = ()->r.nextBoolean();
        Stream.generate(newMoneta)
                .limit(1)
                .forEach(el->System.out.println("Faccia: "+(el?"testa":"croce")));

        System.out.println("\n\n\n--------- OPTIONAL");

        Optional<Integer> impossible = Stream.generate(newDado)
                .limit(1)
                .filter(l->l>8)
                .findFirst();

        //System.out.println(impossible.get()); //NullPointer se Optional è vuoto

        if(impossible.isPresent()){
            System.out.println(impossible.get());
        }else{
            System.out.println(impossible.orElse(-1));
            System.out.println(impossible.orElseGet(newDado));
            System.out.println(impossible.orElseThrow(IllegalStateException::new));
        }

    }//end main
}//end class
