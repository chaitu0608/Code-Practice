import java.util.Scanner;  // Import the Scanner class to read user input

public class GcdLcm {
    // Create a static Scanner object to read input from the user
    private static Scanner scan = new Scanner(System.in);

    // Method to calculate the Greatest Common Divisor (GCD) using recursion
    static int gcd(int a, int b) {
        // If the second number (b) is 0, the GCD is the first number (a)
        if (b == 0) {
            return a;
        }
        // Recursively call the gcd function with 'b' and 'a % b'
        return gcd(b, a % b);
    }

    // Method to calculate the Least Common Multiple (LCM)
    static int lcm(int a, int b) {
        // LCM is calculated as (absolute product of a and b) / GCD of a and b
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1, num2;

        // Prompt the user to enter the first number
        System.out.print("Enter First number: ");
        num1 = scan.nextInt();  // Read the first number

        // Prompt the user to enter the second number
        System.out.print("Enter Second number: ");
        num2 = scan.nextInt();  // Read the second number

        // Calculate GCD of the two numbers
        int gcdValue = gcd(num1, num2);

        // Calculate LCM of the two numbers
        int lcmValue = lcm(num1, num2);

        // Display the GCD of the two numbers
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdValue);

        // Display the LCM of the two numbers
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmValue);
    }
}
