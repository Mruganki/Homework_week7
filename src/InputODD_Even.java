/*
Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;//calling java util package for scanner class
public class InputODD_Even {//class creation by default
    public void odd(){// instance method
        Scanner odd = new Scanner(System.in);// object created in scanner class to run programe
        System.out.println("Enter Value: ");//printstatemnt
        int a = odd.nextInt();// define variable to call object
        if(a % 2 == 0 ) {// give logic to the variable in, if statment syntax
            System.out.println("Even");// if body,print statment (truebody)
        }else {
            System.out.println("False");// else body,printstatment (falsebody)
        }
    }
    public static void main(String[] args) {//main method
        InputODD_Even obj = new InputODD_Even();//object created in mainmethod to call instance method
        obj.odd();//calling instance method into main method via object
    }
}
