package it.eccezioni;

import java.time.LocalTime;
import java.util.InvalidPropertiesFormatException;

public class AppEccezioni {
    public static String nome;

    public static void main(String[] args) {
        //System.out.println(nome.toUpperCase());

        //caso prevedibile
        //if (args.length>=1 && args[0]!=null)
        //System.out.println(args[0]);

        //altri casi non sono prevedibili, o di difficile controllo
        //fingiamo il controllo precedente molto complicato e agiamo di conseguenza


        //try-catch oppure try-finally oppure try-catch-finally
        //il finally va sempre per ultimo

        //try{}   //blocchi di codice che potrebbero sollevare eccezioni
        //catch (Exception e){}  //blocco che cattura la relativa eccezione
        //finally{}   //blocco di codice SEMPRE eseguito

        int a=5, b=0, ris;
        try {
            //System.out.println(args[0]);
            //throw new OutOfMemoryError();
            //ris=a/b;
            //throw new NullPointerException();
            throw new PausaException("E' l'ora della pausa!", LocalTime.now());
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Manca il valore in args");
//            e.printStackTrace();
//        }
//      catch(ArithmeticException e){} //non posso catchare 2 volte la stessa exception
        catch ( ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e){
            System.out.println("Null Pointer / ArrayIndexOutOfBound / Arithmetic Exception rilevata");
            e.printStackTrace();
        }
        catch (RuntimeException e){
            System.out.println("Runtime Exception code here");
            System.out.println(">>> " + e.getMessage() +" "+ (
                    e instanceof PausaException ? ((PausaException) e).getTime() : ""
                    ));
        }
        catch (Exception e){
            System.out.println("exception");
        }
        catch (Throwable e){
            System.out.println("throwable");
        }
        finally{
            System.out.println("Sono nel FINALLY");
        }












        System.out.println("STEP 1");
        //todo ...

        System.out.println("STEP 2");
        // todo ...

        System.out.println("STEP 3");
        // todo ...

        System.out.println("STEP 4");
        // todo ...

        System.out.println("STEP 5");
        // todo ...


    }//end main

}//end class





class PausaException extends RuntimeException{

    LocalTime time;

    public PausaException(){
        this("Pausa Exception!");
    }
    public PausaException(String msg){
        super(msg);
        time=LocalTime.now();
    }
    public PausaException(String msg, LocalTime time){
        super(msg);
        this.time=time;
    }
    public LocalTime getTime() {
        return time;
    }
}