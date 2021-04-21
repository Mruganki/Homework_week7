

import java.time.Year;// time package
import java.util.Scanner;// util package
public class DayInMonth {// class

    static boolean isleapyear() {// static method
        int year,month;// variables created
        boolean result= true;

        System.out.println("Enter the year : ");//printstatement
        Scanner sc = new Scanner(System.in);

        year = sc.nextInt();// vaariable initialise with scanner

        if (year % 4 == 0 && year % 100 != 0 ){//if statment
            result= true;
            System.out.println("This is Leap year");

        } else if  (year % 4 == 0 && year % 100 != 0 || year % 400 != 0){
            result= false;
           System.out.println("This year is not a leap year");
        }else{
        }return result;
    }
    public static void main (String[]args){// main method
        isleapyear();// calling static method
        DaysInMonth();// calling static method

    }
    public static void DaysInMonth(){// static method
        isleapyear();// calling static method
        int days ;// variable define
        boolean a;
        int month;
        int year;

        //days = -1;
        Scanner mySc = new Scanner(System.in);// scanner created
       //System.out.println("Please enter a year : ");
       year = mySc.nextInt();// variable initialise with scanner
       System.out.println("Please enter a month : ");//print statment
       month = mySc.nextInt();
        System.out.println("No of Days are :" );
        if ((month <1 || month >12) && (year<1 || year >9999)) {// if else syntax
            days= -1;
            System.out.println("It is an invalid month ");
         // } else if {
            days= -1;
            System.out.println("It is an invalid year ");

         } else{
        }
            switch (month){// switch method
                case 1:
                    days=31;
                    System.out.println("31");
                    break;

                case 2:
                    a=isleapyear();
                    if(a==true){
                        days= 29;
                        System.out.println("29");
                        break;
                    }else {
                        days= 28;
                        System.out.println("28");
                        break;
                    }

                case 3:
                    days =31;
                    System.out.println("31");
                    break;
                case 4:
                    days =30;
                    System.out.println("30");
                    break;
                case 5:
                    days =31;
                    System.out.println("31");
                    break;
                case 6:
                    days =30;
                    System.out.println("30");
                    break;
                case 7:
                    days =31;
                    System.out.println("31");
                    break;
                case 8:
                    days =31;
                    System.out.println("31");
                    break;
                case 9:
                    days =30;
                    System.out.println("30");
                    break;
                case 10:
                    days =31;
                    System.out.println("31");
                    break;
                case 11:
                    days =30;
                    System.out.println("30");
                    break;
                case 12:
                    days =31;
                    System.out.println("31");
                    break;
                default:
                    System.out.println("-1");//print statement
            }
        }
    }


