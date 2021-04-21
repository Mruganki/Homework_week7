
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 if  any other alphabet should be invalid entry
using switchmethod
 */
import java.util.*;// calling util package
public class AtoF_Switchmethod {
    void m9() {// instance method
        int City;
        Scanner cs = new Scanner(System.in);// scanner object created
        System.out.println("Enter city code:");// printstatement

        City = cs.nextInt();// variable intialised with scanner
        switch (City) {// Switch method syntax
            case 1:
                System.out.println("Ahmedabad");
                break;
            case 2:
                System.out.println("Baroda");
                break;
            case 3:
                System.out.println("Chikli");
                break;
            case 4:
                System.out.println("Dakor");
                break;
            case 5:
                System.out.println("Egola");
                break;
            case 6:
                System.out.println("Fatehpur");
                break;
            default:
                System.out.println("Invalid entry");// printstatement

        }

    }

    public static void main(String[] args) {//main method
        AtoF_Switchmethod  cs = new AtoF_Switchmethod();// constructor
        cs.m9();// calling instance method via object
    }















}
