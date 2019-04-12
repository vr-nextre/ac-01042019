package it.nextre.eccezioni;

public class es8_4 {
    public static void main(String[] args) throws InterruptedException {
        Rocket razzo = new Rocket();
        System.out.println("COUNTDOWN");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(150);
        }//end for
        //CHECKED EXCEPTION
        try {
            razzo.launch();
        } catch (RocketException e) {
            System.err.println(e.getMessage()+"\n\nMission FAILED");
            System.exit(500);
        }
        //UNCHECKED EXCEPTION
        boolean success=true;
        try {
            System.out.println(razzo.getStatus());
        }catch (CrashException ex){
            success=false;
        }

        System.out.println("Mission end " + (success?"very very well ;)":"in a big secular crash :(") );

    }//end main
}//end class


class Rocket{
    public void launch() throws RocketException{
        System.out.println("Take off...");
        if (Math.random()<0.36)
            throw new RocketException("Auxiliary engine damaged");
        System.out.println("Take off success. Launch fine very well!");
    }

    public String getStatus(){
        if (Math.random()<0.44)
            throw new CrashException();
        return "Mission OK";
    }
}//end class


class RocketException extends Exception{
    public RocketException(String msg){super(msg);}
    public RocketException(){this("Rocket Exception!");}
}
class CrashException extends RuntimeException{}