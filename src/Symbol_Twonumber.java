/*
Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *) find addition,
 Subtraction, multiplication and division according to their symbol  (using if else)
 */

import java.util.*;// util package
public class Symbol_Twonumber {// class

    void m10() {// instance method
        Scanner input = new Scanner(System.in);// scanner object
        int num1, num2, ans;// variable defined
        char sign;

        System.out.print("Please Enter your first digit: ");// print statment

        num1 = input.nextInt();// variable initialised with scanner object

        System.out.print("Enter the second digit: ");
        num2 = input.nextInt();


        System.out.print("Enter the mathematical operator to be used: ");
        sign = input.next().charAt(0);// variable initialised with return parameter
        if (sign == '+') {// if elseif syntax
            ans = num1 + num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + " " + ans);
        } else if (sign == '-') {
            ans = num1 - num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + " " + ans);
        } else if (sign == '/') {
            ans = num1 / num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + " " + ans);
        } else if (sign == '*') {
            ans = num1 * num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + " " + ans);
        } else
            System.out.println("Your Input is not correct");
    }
    public static void main(String[] args) {// main method
        Symbol_Twonumber obj = new Symbol_Twonumber();// constructor
        obj.m10();// calling instance method
    }
}