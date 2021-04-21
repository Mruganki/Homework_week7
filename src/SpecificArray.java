
/*

Write a Java program to test if an array contains a specific value.
 */

public class SpecificArray {// class

    public static boolean contains(int[] arr, int item) {// static method
        for (int n : arr) {// logic for common element
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {//main method
        int[] my_array1 = {// array defined
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        System.out.println(contains(my_array1, 2013));// printstatment
        System.out.println(contains(my_array1, 2015));
    }




















}