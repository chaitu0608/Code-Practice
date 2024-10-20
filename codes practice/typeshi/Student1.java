import java.util.Scanner;

// Abstract class 'Marks'
abstract class Marks {
    // Abstract method to calculate percentage
    public abstract double getPercentage();
}

// Class 'A' for Student A with marks in 3 subjects
class A extends Marks {
    private int subject1, subject2, subject3;

    // Constructor to initialize marks for student A
    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Override the abstract method to calculate percentage
    @Override
    public double getPercentage() {
        int totalMarks = subject1 + subject2 + subject3;
        return (totalMarks / 3.0); // Calculate the average percentage for 3 subjects
    }
}

// Class 'B' for Student B with marks in 4 subjects
class B extends Marks {
    private int subject1, subject2, subject3, subject4;

    // Constructor to initialize marks for student B
    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    // Override the abstract method to calculate percentage
    @Override
    public double getPercentage() {
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        return (totalMarks / 4.0); // Calculate the average percentage for 4 subjects
    }
}

// Main class to execute the program
public class Student1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for Student A (3 subjects)
        System.out.println("Enter marks for Student A in 3 subjects (out of 100):");
        System.out.print("Subject 1: ");
        int a1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int a2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int a3 = scanner.nextInt();

        // Create object for Student A
        A studentA = new A(a1, a2, a3);

        // Input marks for Student B (4 subjects)
        // Input marks for Student B (4 subjects)
        System.out.println("\nEnter marks for Student B in 4 subjects (out of 100):");
        System.out.print("Subject 1: ");
        int b1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int b2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int b3 = scanner.nextInt();
        System.out.print("Subject 4: ");
        int b4 = scanner.nextInt();

        // Create object for Student B
        B studentB = new B(b1, b2, b3, b4);

        // Print percentage for both students
        System.out.println("\nPercentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");

        scanner.close();
    }
}
