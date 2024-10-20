import java.util.*;

class Employeenew{
    int salary;
    String Name;

    public int getsalary(){
        return this.salary;
    }

    public String getName(){
        return this.Name;
    }

    public void setSalary(int sal){
        this.salary = sal;
    }

    public void setName(String str){
        this.Name = str;
    }
}//end of employee
public class employeeCWH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employeenew one = new Employeenew();

        System.out.println("Enter the Name");
        String name = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter the salary");
        int sal = sc.nextInt();

        one.setName(name);
        one.setSalary(sal);

        System.out.println("The salary of one is: "+ one.getsalary());
        System.out.println("The Name of one is: "+ one.getName());

    }//end of main
}//end of class
