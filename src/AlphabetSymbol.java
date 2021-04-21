/*
. Write a program that tells us input value is number or an alphabet or symbol.
 */
import java.util.*;//calling util package for java scanner
public class AlphabetSymbol {// class created
    public static void main(String[] args) {
       m1();
    }//main method calling static method directly
    public static void m1() {// static method
        Scanner scanner = new Scanner(System.in);// scanner object define

        System.out.println("Enter any character : ");//printstatement
        char ch = scanner.next().charAt(0);// variable initialise with scanner object

        // Using character class
        if (Character.isAlphabetic(ch)) {// if _ else if syntax

            System.out.println(ch + " is A ALPHABET.");

        } else if (Character.isDigit(ch)) {

            System.out.println(ch + " is A DIGIT.");

        } else {

            System.out.println(ch + " is A SYMBOL");// print statement

        }

    }
}






