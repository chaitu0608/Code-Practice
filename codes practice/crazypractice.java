import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class EmployeeManager {
    private String eName;
    private int eId;
    private double eSalary;
    private static Vector<EmployeeManager> employees = new Vector<>();

    // Create a custom Comparator for sorting employees by salary
    public static Comparator<EmployeeManager> salaryComparator = new Comparator<EmployeeManager>() {
        @Override
        public int compare(EmployeeManager e1, EmployeeManager e2) {
            return Double.compare(e1.getESalary(), e2.getESalary());
        }
    };

    // Constructor
    public EmployeeManager(String eName, int eId, double eSalary) {
        this.eName = eName;
        this.eId = eId;
        this.eSalary = eSalary;
    }

    // Getter methods
    public String getEName() {
        return eName;
    }

    public int getEId() {
        return eId;
    }

    public double getESalary() {
        return eSalary;
    }

    // 1) Create: Accepts 'n' employee records and sorts them by E-Salary
    public static void createEmployee(EmployeeManager employee) {
        employees.add(employee);
        employees.sort(salaryComparator);
    }

    // 2) deleteByEName: Deletes the record with the given name
    public static void deleteByEName(String name) {
        employees.removeIf(emp -> emp.getEName().equalsIgnoreCase(name));
    }

    // 3) deleteByEId: Deletes the record with the given ID
    public static void deleteByEId(int id) {
        employees.removeIf(emp -> emp.getEId() == id);
    }

    // Display all employees
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
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of employees to create: ");
                    int n = scanner.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter name of employee " + (i + 1) + ": ");
                        String name = scanner.next();

                        System.out.print("Enter ID of employee " + (i + 1) + ": ");
                        int id = scanner.nextInt();

                        System.out.print("Enter salary of employee " + (i + 1) + ": ");
                        double salary = scanner.nextDouble();

                        createEmployee(new EmployeeManager(name, id, salary));
                    }
                    break;

                case 2:
                    System.out.println("\nInsert a new employee:");
                    System.out.print("Enter name: ");
                    String newName = scanner.next();

                    System.out.print("Enter ID: ");
                    int newId = scanner.nextInt();

                    System.out.print("Enter salary: ");
                    double newSalary = scanner.nextDouble();

                    createEmployee(new EmployeeManager(newName, newId, newSalary));
                    break;

                case 3:
                    System.out.print("\nEnter the name of the employee to delete: ");
                    String deleteName = scanner.next();
                    deleteByEName(deleteName);
                    break;

                case 4:
                    System.out.print("\nEnter the ID of the employee to delete: ");
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
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 6);

        scanner.close();
    }
}