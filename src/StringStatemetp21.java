/*

   ("String length() - length of the string");
   ("String charAt() - returns a char value at the given index number");
   ("String concat() - combines specified string at the end of this string");
   ("String contains() - returns true if chars are found in the string");
   ("String startsWith() - checks if this string starts with given prefix");
   ("String endsWith() - check if this string ends with the given suffix");
   ("String equals() - compares the contents of two given strings");
   ("String indexOF() - returns index of given character value or substring");
   ("String isEmpty() - checks if this string is empty");
   ("String replace() - returns a string replacing all the old char to new char");
   ("String substring() - returns a part of the string");
   ("String toCharArray() - converts this string into character array");
   ("String toLowercase() - returns the string in lowercase letter");
   ("String toUppercase() - returns the string in uppercase letter");
   ("String trim() - eliminates leading and trailing spaces");
 */
import java.util.*;// util package
public class StringStatemetp21 {// class

    public static void main(String[] args) {// main method
        String str1= "Hello";// string define
        String str2= "Universe";
        String str3=  "";
        System.out.println("string length is: "+str2.length());//print staememnt
        System.out.println("String length -Length of the String: "      + str1.length());
        System.out.println("String charAt() - Char value of the String:"  + str2.charAt(5));
        System.out.println("String concat() - Combines the String" + str1.concat(str2));
        System.out.println("String contains() - Returns true if char are found" + str2.contains(str1));
        System.out.println("String startsWith() - String starts with prefix" + str1.startsWith(str2));
        System.out.println("String endsWith() - String ends with suffix" + str2.endsWith(str1));
        System.out.println("String equals() - Compare the contents of two strings" + str1.equals(str2));
        System.out.println("String indexOf() - Give index of given character value" + str2.indexOf(str1));
        System.out.println("String isEmpty()-Check if string is empty" + str3.isEmpty());
        System.out.println("String replace() -a string replacing all the old char to new char" + str1.replace("P","W"));
        System.out.println("String substring() - returns a part of the string" + str2.substring(0,4));
        System.out.println("String toCharArray() - converts this string into character array" + str2.toCharArray());
        System.out.println("String toLowercase() - returns the string in lowercase letter" + str2.toLowerCase(Locale.ROOT));
        System.out.println("String toUppercase() - returns the string in uppercase letter" + str1.toUpperCase(Locale.ROOT));
        System.out.println("String trim() - eliminates leading and trailing spaces" + str1.trim());
    }



    }











