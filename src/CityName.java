/*
Created by: Mruganki
Input any alphabet from “A" to “F” and print their city name
 accordingly (use if else) if  any other alphabet should be invalid entry
 */
import java.util.*;// calling java util package for scanner class
public class CityName {// class created
    static void cities(){// static method
        Scanner sc = new Scanner(System.in);// scanner created to run programme
        System.out.println("Enter city name : ");// print statement
        char city=sc.next().charAt(0);// define variable with scanner object

        if (city=='a') {// if_Else statment syntax
            System.out.println("Amsterdam");// printstatement
        }else if (city=='b'){// if_Else statment syntax
            System.out.println("Brussels");
        }else if (city == 'c'){// if_Else statment syntax
            System.out.println("Charleroi");
        }else if (city == 'd') {// if_Else statment syntax
            System.out.println("Dublin");
        }else if (city == 'e') {// if_Else statment syntax
            System.out.println("Espoo");
        }else if (city == 'f') {// if_Else statment syntax
            System.out.println("Frankfurt");
        }else {
            System.out.println("Invalid Entry");
        }
    }
    public static void main(String[] args) { // main statement
       //CityName obj = new CityName(); you don't need object to call static method to main method
       cities();// calling static method to main method directly
    }
}
