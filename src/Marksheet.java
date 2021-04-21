/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message
 “Invalid  Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade
 if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C
 */
import javax.lang.model.element.Name;
import java.util.*;// calling util package
public class Marksheet {// class created
    String  result, grade;// variable define

    public static void main(String[] args) {// main method
        Marksheet p3 = new Marksheet();// constructor
        p3.mymarksheet();// calling instance method
    }

    public void mymarksheet() {// instance method
        //int maths,english;
        //int total;
       // String name;
        String result=null;
        String grade=null;
        //int rollno;
        //int maths;
       // int science;
       // int english;
        Scanner mp3 = new Scanner(System.in);// scanner object created
        System.out.println("Name :");// printstatement
        String name = mp3.nextLine();// variable initialise with scanner
        System.out.println("Roll No :");
        int rollno = mp3.nextInt();
        System.out.println("Maths");
        int maths = mp3.nextInt();
        System.out.println("Science");
        int science = mp3.nextInt();
        System.out.println("English");
        int english = mp3.nextInt();
        int total = 0;
        float percentage=0;// variable initialised
        if (maths > 0 && maths <= 100) {// if else syntax
            if (science > 0 && science <= 100) {
                if (english > 0 && english <= 100) {
                    total = (maths + science + english);
                    percentage = (float) ((100 * total) / 300);// logic for percentage
                    if (percentage < 35) {
                        result = " Fail";
                        grade = " N/a ";
                    } else if (percentage >= 35) {
                        result = " Pass";
                        grade = " C ";
                        if (percentage >= 50) {
                            result = " Pass";
                            grade = " B ";
                            if (percentage >= 60) {
                                result = " Pass ";
                                grade = " A ";
                                if (percentage >= 80) {
                                    result = " Pass ";
                                    grade = " A+ ";
                                } else
                                    System.out.println("Invalid Input, Marks should be 0 to 100 ");
                            }
                        }
                    }
                }
            }
        }

        System.out.println("______________________________________________________");
        System.out.println("|                MARKSHEET                            |");
        System.out.println("|_____________________________________________________|");
        System.out.println("|  Name    :   "+name+"                               |");
        System.out.println("|  ROLL No :   "+rollno+"                             |");
        System.out.println("|_____________________________________________________|");
        System.out.println("| Subjects : Marks                                    |");
        System.out.println("|                                                     |");
        System.out.println("______________________________________________________|");
        System.out.println("| Maths    :  "+maths+"                               |");
        System.out.println("| Science  :  "+science+"                             |");
        System.out.println("| English  :  "+english+"                             |");
        System.out.println("|_____________________________________________________|");
        System.out.println("| Total    :   "+total+"                              |");
        System.out.println("|_____________________________________________________|");
        System.out.println("|Percentage:   "+percentage+"                         |");
        System.out.println("|Result    :    "+result+"                            |");
        System.out.println("|Grade     :  "+grade+"                               |");
        System.out.println("|_____________________________________________________|");
    }

}