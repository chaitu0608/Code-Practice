import java.util.*;


class Employee{
    private String eName;
    private String eId;
    private double eSalary;


    public Employee(String eName, String eId, double eSalary){
        this.eName = eName;
        this.eId = eId;
        this.eSalary = eSalary;
    }


    public String getEName(){
        return eName;
    }


    public String getEId(){
        return eId;
    }


    public double getESalary(){
        return eSalary;
    }



    @Override 
    public String toString(){
        return "Employee{" +
                "Name='" + eName + '\'' +
                ", Id='" + eId + '\'' +
                ", Salary=" + eSalary +
                '}';
    }
}


class EmployeeManager{
    private Vector<Employee> employees;


    public EmployeeManager(){
        employees = new Vector<>();
    }



    public void insert(Employee employee){
        int index = 0;
        while (index < employees.size() && employees.get(index).getESalary() < employee.getESalary()) {
            index++;
        }
        employees.add(index, employee);
    }



    public void displayEmployees(){
        System.err.println("Employee Details sorted as per E-Salary : ");
        for (Employee employee : employees){
            System.out.println(employee);//The toString method is implicitly called here causing it to display according to the return value of toString method
        }
    }



    public void deleteByEName(String name){
        int i;
        for (i=0; i<employees.size(); i++){
            if (employees.get(i).getEName().equalsIgnoreCase(name)){
                employees.remove(i);
                System.out.println("Deleted employee with name: " + name);
                return;
            }
        }
        System.out.println("Employee with name " + name + " not found.");
    }



    public void deleteByEId(String id){
        int i;
        for(i=0; i<employees.size(); i++){
            if (employees.get(i).getEId().equalsIgnoreCase(id)){
                employees.remove(i);
                System.out.println("Deleted employee with ID: " + id);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}


public class emp{
    public static void main(String[] args){
        EmployeeManager manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);


        int m = 1;
        int ch;
        System.out.println("1.Add Employee details");
        System.out.println("2.Delete an employee details (name)");
        System.out.println("3.Delete an employee details (ID)");
        System.out.println("4.Display all employee details");
        System.out.println("5.Exit\n");


        while(m==1){
            System.out.print("Enter your operation: ");
            ch = sc.nextInt();
            sc.nextLine();


            switch (ch){
                case 1:
                    int x;
                    System.out.println("Enter the size of database: ");
                    x = sc.nextInt();
                    sc.nextLine();


                    int i;
                    for(i=0; i<x; i++){
                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Employee ID: ");
                        String id = sc.nextLine();
                        System.out.print("Enter Employee Salary: ");
                        double salary = sc.nextDouble();
                        sc.nextLine();


                        Employee employee = new Employee(name, id, salary);
                        manager.insert(employee);
                    }
                    break;


                case 2: //delete an employee's details by name
                    System.out.print("Enter the name of the employee to delete: ");
                    String namedel = sc.nextLine();
                    manager.deleteByEName(namedel);
                    break;


                case 3: //delete an employee's details by ID
                    System.out.print("Enter the ID of the employee to delete: ");
                    String IDdel = sc.nextLine();
                    manager.deleteByEId(IDdel);
                    break;


                case 4: //display
                    manager.displayEmployees();
                    break;


                case 5: //exit
                    m = 0;
                    System.err.println("Thank you for your time");
                    break;


                default:
                    System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
