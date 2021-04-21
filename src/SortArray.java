import java.util.Arrays;// util package

public class SortArray {// class

    public static void main(String[] args) {// main method
        SortArray p17 = new SortArray();// consturctor
        p17.intString();// calling instance method
    }
    public void intString () {// instance method

        int num[] ={90,20,70,40,80,10};// array define
        Arrays.sort(num);// default sort array syntax
        String name[]={"My","Name","is","really","new","nice"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));// print statement
        System.out.println(Arrays.toString(num));
    }
        }






