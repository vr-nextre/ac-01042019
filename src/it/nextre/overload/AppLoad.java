package it.nextre.overload;

import java.math.BigInteger;

public class AppLoad {

    public static void main(String[] args) {

        m(new Integer(4), 5);
        m(new Long(4), 5);
        m(3,4);




    }//end main

    private static void m(long i, int ... j) {
        System.out.println("m int intS");
    }

    private static void m(int ... j) {
        System.out.println("m intS");
    }




/*
    private static void m(int i, int j) {
        System.out.println("m int int");
    }

 */
    /*
    private static void m(double i, double j) {
        System.out.println("m double double");
    }
    */

    /*
    private static void m(double i, int j) {
        System.out.println("m double int");
    }
    */
    /*
    private static void m(int i, double j) {
        System.out.println("m int double");
    }
    */

    /*
    private static void m(long i, long j) {
        System.out.println("m long long");
    }
    */


    /*
    private static void m(long i, int j) {
        System.out.println("m long int");
    }

     */
    /*
    private static void m(int i, long j) {
        System.out.println("m int long");
    }
    */
    /*
    private static void m(double i, float j) {
        System.out.println("m double float");
    }
    */

    /*
    private static void m(float i, float j) {
        System.out.println("m float float");
    }
    */


/*
    private static void m(Integer i, int j) {
        System.out.println("m Integer int");
    }
    private static void m(int i, Integer j) {
        System.out.println("m int Integer");
    }
*/

/*
    private static void m(Integer i, Integer j) {
        System.out.println("m Integer Integer");
    }
*/


    private static void m(Integer i, Long j) {
        System.out.println("m Integer Long");
    }

    /*
    private static void m(Long i, Integer j) {
        System.out.println("m Long Integer");
    }

     */

    private static void m(Long i, Long j) {
        System.out.println("m Long Long");
    }
    /*
    private static void m(Long i, int j) {
        System.out.println("m Long int");
    }
    */

    private static void m(int i, Long j) {
        System.out.println("m int Long");
    }





}//end class
