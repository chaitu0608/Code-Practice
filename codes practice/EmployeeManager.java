import java.util.Scanner;
import java.util.Vector;

public class EmployeeManager {
    private String eName;
    private int eId;
    private double eSalary;
    private static Vector<EmployeeManager> employees = new Vector<>();

    public EmployeeManager(String eName, int eId, double eSalary) {
        this.eName = eName;
        this.eId = eId;
        this.eSalary = eSalary;
    }

    public String getEName() {
        return eName;
    }

    public int getEId() {
        return eId;
    }

    public double getESalary() {
        return eSalary;
    }

    public static void createEmployee(EmployeeManager employee) {
        employees.add(employee);
    }

    public static void deleteByEName(String name) {
        employees.removeIf(emp -> emp.getEName().equalsIgnoreCase(name));
    }

    public static void deleteByEId(int id) {
        employees.removeIf(emp -> emp.getEId() == id);
    }

    public static void displayEmployees() {
        for (EmployeeManager emp : employees) {
            System.out.println("Employee [Name=" + emp.getEName() + ", ID=" + emp.getEId() + ", Salary=" + emp.getESalary() + "]");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Create Employee");
            System.out.println("2. Insert New Employee");
            System.out.println("3. Delete Employee by Name");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Display Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choicec 1,2,3,4,5,6 : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("How many Employees do you want to create...Enter a Number : ");
                    int n = scanner.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter Name of Employee " + (i + 1) + ": ");
                        String name = scanner.next();

                        System.out.print("Enter ID of Employee " + (i + 1) + ": ");
                        int id = scanner.nextInt();

                        System.out.print("Enter Salary of Employee " + (i + 1) + ": ");
                        double salary = scanner.nextDouble();

                        createEmployee(new EmployeeManager(name, id, salary));
                    }
                    break;

                case 2:
                    System.out.println("\nInsert a New Employee:");
                    System.out.print("Enter Name: ");
                    String newName = scanner.next();

                    System.out.print("Enter ID: ");
                    int newId = scanner.nextInt();

                    System.out.print("Enter Salary: ");
                    double newSalary = scanner.nextDouble();

                    createEmployee(new EmployeeManager(newName, newId, newSalary));
                    break;

                case 3:
                    System.out.print("\nEnter the Name of the Employee you want to DELETE : ");
                    String deleteName = scanner.next();
                    deleteByEName(deleteName);
                    break;

                case 4:
                    System.out.print("\nEnter the ID of the Employee you want to DELETE : ");
                    int deleteId = scanner.nextInt();
                    deleteByEId(deleteId);
                    break;

                case 5:
                    System.out.println("\nEmployees:");
                    displayEmployees();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option....Code Terminated");
            }
        } while (choice != 6);

        scanner.close();
    }
}