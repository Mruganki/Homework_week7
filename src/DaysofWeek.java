
import java.util.Scanner;
public class DaysofWeek {

    public static void main(String[] args) {// static method callin in to main method
        getDayName();
    }

    // Get the name for the Week
    public static void getDayName() {// static method

        int day;
        Scanner in = new Scanner(System.in);// scanner

        System.out.print("Input number: ");//print statement
        day = in.nextInt();// variable initialise with scanner
        switch (day) {//switch method

            case 1:
                System.out.println("First day is Monday");//printstatement
                break;
            case 2:
                System.out.println("Second day is Tuesday");
                break;
            case 3:
                System.out.println("Third day is Wednesday");
                break;
            case 4:
                System.out.println("Forth day is Thursday");
                break;
            case 5:
                System.out.println("Fifth day is Friday");
                break;
            case 6:
                System.out.println("Sixth day is Saturday");
                break;
            case 7:
                System.out.println("Seventh day is Sunday");
                break;
            default:
                System.out.println("Week contain 1 to 7 days ");
        }
    }
}


















