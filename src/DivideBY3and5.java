/*
java program to print the numbers between 1 to 100 which can be divided by 3  and 5 separately.
 */

public class DivideBY3and5 {

        public static void main(String args[]) {//main method
            DivideBY3and5 p11 = new DivideBY3and5();// constructor
            p11.m1();//calling instance method
        }
            public void m1(){// instance method

            System.out.println("\nDivided by 3: ");//printstatment
            for (int i=1; i<100; i++) {// logic for division for 3
                if (i%3==0)
                    System.out.print(i +", ");
            }

            System.out.println("\n\nDivided by 5: ");
            for (int i=1; i<100; i++) {// logic for division for 5
                if (i%5==0) System.out.print(i +", ");
            }

            System.out.println("\n\nDivided by 3 & 5: ");
            for (int i=1; i<100; i++) {// logic for division for 3 & 5
                if (i%3==0 && i%5==0) System.out.print(i +", ");
            }
            System.out.println("\n");// printstatement
        }
    }








