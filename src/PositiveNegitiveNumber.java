/*
Created by: Mruganki
 Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */


import java .util.*;

public class PositiveNegitiveNumber {

    public void m1() {// instance method
        Scanner obj = new Scanner(System.in);// scanner
        int number;//variable define
        System.out.println("Enter value :");//printstatment
        number = obj.nextInt();//variable initialise with scanner object


        if (number > 0) {// if else syntax
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negetivie Number ");
        } else
            System.out.println("ZERO");
    }


    public static void main(String[] args) {// main method
        PositiveNegitiveNumber pn2 = new PositiveNegitiveNumber();// constructor
        pn2.m1();// calling intance method with object
    }
}
