/*
18. Write a Java program to sum values of an array.
 */

/*
18. Write a Java program to sum values of an array.
 */
public class SumArray {//class

    public static void main(String[] args) {// main method

        SumArray p18 = new SumArray();
      p18.sumofarray();// instance method calling

    }
     void sumofarray(){// instance method

         int num1[] = {10,20,30,40,50,60};// array defined

         int sum = 0;// variable initialised

         for (int i : num1)// logic for sum array

             sum +=i;
         System.out.println("The sum is "+ sum);// print statment





     }


}
