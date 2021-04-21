/*

prgm 19
 */
public class AvgArray {
    public static void main(String[] args) {// main method
        AvgArray p19 = new AvgArray();// constuctor
        p19.avgofarray();// calling instance method via obj
    }

    void avgofarray() {// instance method

        int num1[] = {10,20,30,40,50,60,70};

        int avg =0;

        for (int i : num1)// logic for average

            avg += i/7;// formula for average
        System.out.println("The avg is " + avg);// print statement

    }

}
