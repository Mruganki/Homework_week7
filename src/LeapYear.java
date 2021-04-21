
/*
Created by: Mruganki
Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?
 */
import java.util.*;// calling java util package for calling scanner class
public class LeapYear {// class created by default
    public void leap() {// instantce method
        long a, y, c;// intance variable
        Scanner sc = new Scanner(System.in);// creating obj in scanner class
        System.out.print("enter  any  calendar year :");// print statement
        y = sc.nextLong();// calling scanner object with define  instance variable
        if (y != 0) {// if statement syntax with logic
            a = (y % 400 == 0) ? (c = 1) : ((y % 100 == 0) ? (c = 0) : ((y % 4 == 0) ? (c = 1) : (c = 0)));
            if (a == 1)// define variable
                System.out.println(y + " is a leap year");//printstatement
            else
                System.out.println(y + " is not a leap year");//printstatement
        } else// if statement syntax
            System.out.println("year zero does not exist ");// print statement
    }
    public static void main(String[] args) {// main method
        LeapYear obj = new LeapYear ();// creating object to call instance method into main
        obj.leap();// calling instance method using object created
    }
}
