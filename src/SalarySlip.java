/* Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee N_______________________________
|ame : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|
 */
import java.util.*;// util package
public class SalarySlip {// class created
    public static void main(String[] args) {
        SalarySlip   obj = new SalarySlip ();// scanner created
        obj.salaryGross();//initialise variable
    }

    void salaryGross(){// instance method
        Scanner scan = new Scanner(System.in);// scanner
        System.out.println("Enter Basic Salary Here : ");// printstatement
        long basicSalary;// variable define
        basicSalary = scan.nextLong();// variable initialise with scanner object
        double hra=0,ta=0,da = 0,pf=0,grossSalary;// variable define
        System.out.println("Enter Employee Name here :");// print statment
        String employeeName= scan.next();// variable initialise with scanner object
        System.out.println("Enter Employee Id here: ");// print statememnt
        int employeeId = scan.nextInt();// variable initialised with scanner object

        hra = (basicSalary* 10)/100;// logic for all calulations
        da = (basicSalary *  8) / 100;
        ta = (basicSalary * 9) /100;
        pf = (basicSalary * 20)/100;
        grossSalary = ((basicSalary + hra + da + ta )- (pf));
        System.out.println("-----------------------------------");//printstatemtn
        System.out.println("|Salary Slip                       |");
        System.out.println("|----------------------------------|");
        System.out.println("|Employee Id:"+employeeId+"        |");
        System.out.println("|Employee Name:"+employeeName+"    |");
        System.out.println("|----------------------------------|");
        System.out.println("|Basic Salary " + basicSalary+"    |");
        System.out.println("|HRA " +hra+ "                      ");
        System.out.println("|DA " +da+ "                        ");
        System.out.println("|TA " +ta+"                         ");
        System.out.println("|PF " +pf+"                         ");
        System.out.println("|----------------------------------|");
        System.out.println("|GROSS SALARY " +grossSalary+"      ");
        System.out.println("|==================================|");

    }
















}
