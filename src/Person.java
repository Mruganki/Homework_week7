/*
person firstname,lastname ,age
 */

public class Person {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }

    String firstName, lastName;// variable define
    int age;

    public String getFirstName() {
        return firstName;
    }// intance method with return variable

    public String getLastName() {// instance method with return variable
        //this.lastName=lastName;
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//instance method with return parameter

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {// method with return parameters
        this.age=age;
        if (age <= 0 || age >= 100) {
            System.out.println( "" );
        } else {
            age =0;
        }
    }

    public boolean isTeen() {// instance method
        boolean result;
        result = age > 12 && age < 20;
        return result;
    }
    public String getFullName() {// instance method with if else syntax
        String fullName;

        if (firstName == null && lastName == null) {
            fullName = "";
        } else if (firstName != null && lastName==null) {// else if body
            fullName = firstName;
        } else if (lastName != null && firstName==null ) {
            fullName = lastName;
        } else {
            fullName = firstName.concat( lastName );
        }return fullName;
    }
    public void IsEmpty() {// instance method
        firstName = "";
        lastName = "";
        System.out.println( firstName.isEmpty() );// printstaement
        System.out.println( lastName.isEmpty() );
        ;
    }
}