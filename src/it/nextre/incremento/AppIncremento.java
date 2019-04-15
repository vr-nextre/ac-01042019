package it.nextre.incremento;

public class AppIncremento {

    public static void main(String[] args) {

        byte num = 0;

        //pre incremento ++num
        ++num;  // num = (byte)(num+1) e poi leggo il valore di num
        //post incremento
        num++; //leggo il valore di num e poi lo incremento num = (byte)(num+1)

        num--;
        num--;
        System.out.println(num); // = 0


        System.out.println(num++);       // 0
        System.out.println("num="+num);   // 1
        num--;                           //ritorno a 0
        System.out.println(++num);       // 1
        System.out.println("num="+num);   // 1

        num--;


        System.out.println(++num+--num);   // 1+0 = 1
        System.out.println("num="+num);    //0
        System.out.println(num+++--num);   // 0+0 = 0
        System.out.println("num="+num);    //0
        System.out.println(num + - + --num);   // 0+0 = 1  num=-1
        num++;
        System.out.println("num="+num);    //0
        System.out.println(num + + + --num);   // 0+0 = -1
        num++;
        System.out.println("num="+num);    //0
        System.out.println(num++ + --num);   // 0+0 = 0  num=0




        num=0;                           //ritorno a 0 x array


        int[] arr = new int[3]; // [0,0,0]
        arr[num++] = 5; // [5,0,0]
        arr[num++] = 4; // [5,4,0]
        arr[num++] = 2; // [5,4,2]
        System.out.println(num); // = 3









    }//end main



}//end class
