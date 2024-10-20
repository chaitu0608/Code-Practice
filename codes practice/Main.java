import java.util.Scanner;
import java.util.Vector;

// Enumeration representing Car Types
enum CarType {
    SEDAN, SUV, HATCHBACK;
}

// Interface defining car behavior (Abstraction)
interface Car {
    void accelerate();
    void brake();
}

// Abstract class providing common properties and partially implemented methods
abstract class Vehicle {
    String model;
    int year;

    // Constructor for Vehicle
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Abstract method
    public abstract void displayDetails();

    // Concrete method
    public void start() {
        System.out.println(model + " is starting.");
    }
}

// Class Sedan inherits Vehicle and implements Car interface
class Sedan extends Vehicle implements Car {
    CarType carType = CarType.SEDAN;

    public Sedan(String model, int year) {
        super(model, year);
    }

    @Override
    public void accelerate() {
        System.out.println(model + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println(model + " is braking.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Sedan Model: " + model + ", Year: " + year);
    }
}

// Class SUV inherits Vehicle and implements Car interface
class SUV extends Vehicle implements Car {
    CarType carType = CarType.SUV;

    public SUV(String model, int year) {
        super(model, year);
    }

    @Override
    public void accelerate() {
        System.out.println(model + " is accelerating with powerful torque.");
    }

    @Override
    public void brake() {
        System.out.println(model + " is braking with ABS.");
    }

    @Override
    public void displayDetails() {
        System.out.println("SUV Model: " + model + ", Year: " + year);
    }
}

// Class for managing Vehicle objects (Array of Objects, Vector, and Exception Handling)
class VehicleManager {
    // Vector to store Vehicle objects (Array of Objects and Vector)
    Vector<Vehicle> vehicleList = new Vector<>();

    // Method to add Vehicle
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    // Method to display all vehicles
    public void showVehicles() {
        if (vehicleList.isEmpty()) {
            System.out.println("No vehicles in the system.");
        } else {
            for (Vehicle v : vehicleList) {
                v.displayDetails();
            }
        }
    }

    // Demonstrating Polymorphism (Vehicles behave differently)
    public void testVehicles() {
        try {
            for (Vehicle v : vehicleList) {
                v.start();  // Inherited method from abstract class Vehicle
                Car car = (Car) v;  // Polymorphism - treating Vehicle as Car
                car.accelerate();   // Car's behavior (Accelerate) varies based on vehicle type
                car.brake();        // Car's behavior (Brake) varies based on vehicle type
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManager manager = new VehicleManager();

        // Input number of vehicles
        System.out.println("Enter the number of vehicles:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input vehicle details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter vehicle type (1 for Sedan, 2 for SUV):");
            int type = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.println("Enter vehicle model:");
            String model = scanner.nextLine();

            System.out.println("Enter vehicle year:");
            int year = scanner.nextInt();

            if (type == 1) {
                manager.addVehicle(new Sedan(model, year));
            } else if (type == 2) {
                manager.addVehicle(new SUV(model, year));
            } else {
                System.out.println("Invalid type.");
            }
        }

        // Display vehicle details
        System.out.println("\nDisplaying Vehicle Details:");
        manager.showVehicles();

        // Test vehicles
        System.out.println("\nTesting Vehicles:");
        manager.testVehicles();
    }
}
