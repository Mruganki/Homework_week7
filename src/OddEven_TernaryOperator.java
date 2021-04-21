
/*
Created by : Mruganki
Write a java program that tells us that Input number is odd or even?
  HINT: use ternary operator (? :)
 */
import java.util.*;//calling java util package for scanner class to run
public class OddEven_TernaryOperator {// class define
    public void OE () {// instance method
        int x;// variable define
        Scanner in = new Scanner(System.in);// object define in scanner class
        System.out.println("Enter an integer number to check:\n");// print statement
        x = in.nextInt();//calling scanner object with define variable
        x = x % 2 == 0 ? 1 : 0;// ternary operator logic
        if (x == 1) {// if statement syntax
            System.out.println("The input number is even.\n");//printstatement, if body
        } else { // else body
            System.out.println("The input number is odd.\n");// printstatment, else body
        }
    }
    public static void main(String[] args) {// main method
        OddEven_TernaryOperator obj = new OddEven_TernaryOperator ();// creating object in main method to call instance method
        obj.OE();// calling instance method
    }
}
