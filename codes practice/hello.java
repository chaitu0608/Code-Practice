import java.util.*;

class Employee {
    int id;
    String name;
    int salary;

    // Method to print employee details
    public void printDetails() {
        System.out.println("My ID is " + id);
        System.out.println("And my name is " + name);
    }

    // Method to return employee salary
    public int getSalary(){
        System.out.println("Salary is " + salary);
        return salary;  // Added return statement
    }
}

public class Hello {
    public static void main(String[] args) {
        System.out.println("This is our custom public class");

        // Creating Employee objects
        Employee harry = new Employee();
        Employee chaitu = new Employee();

        // Setting values for harry
        harry.id = 11;
        harry.name = "CodewithHarry";
        harry.salary = 10000;

        // Setting values for chaitu
        chaitu.id = 100;
        chaitu.name = "Chaitanya Dhamdhere";
        chaitu.salary = 1350000;

        // Printing employee details
        harry.printDetails();
        chaitu.printDetails();

        // Getting and printing salary
        int harrySalary = harry.getSalary();
        int chaituSalary = chaitu.getSalary();
    }
}
