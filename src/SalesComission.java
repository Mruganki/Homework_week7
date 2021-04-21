/*
Created by: Mruganki
Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
import java.util.*;// util package
public class SalesComission {// class
   public void SalaryComission (){// instance method

       int salesamount = 0;int comission = 0;// variable define
       Scanner mysc = new Scanner(System.in);// scanner object
       System.out.println("Enter Sales ID :  ");// print statment
       String salesID = mysc.next();// variable initialised
       System.out.println("Enter Sellers Name :   ");
       String SellerName = mysc.next();
       System.out.println("Enter Sales amount :  " );
       int Salesamount = mysc.nextInt();
       System.out.println("Enter Salary Basic : 30000  ");
       int salarybasic = mysc.nextInt();

       if (salesamount >=50000){// if else syntax
           System.out.println("Commission is 35%");
         comission = ((50000*35)/100);
       }else if (salesamount >=30000) {
          comission = ((30000*20)/100);
       }else if (Salesamount >=20000){
           comission = ((20000*10)/100);
       }else if (salesamount >= 10000){
           comission = ((10000*5)/100);
       } else if (salesamount <10000){
           comission = ((10000*2)/100);
       }
         int total = salarybasic + comission;
       System.out.println("Total Salary with comission "+ comission);// printstatment
   }
    public static void main(String[] args) {// main method
      SalesComission obj = new SalesComission();// contructor
      obj.SalaryComission();// calling instance method

    }
    }

