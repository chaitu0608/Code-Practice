import java.util.Scanner;  // Import the Scanner class for user input

public class PerfectNum {
    
    // Method to check if a number is a perfect number
    static boolean isPerfectNumber(int number) {
        // Any number less than 2 can't be perfect (since 1 is the smallest divisor)
        if (number < 2) return false; 

        // Initialize the sum of divisors to 1 because 1 is a divisor for all numbers
        int sum = 1;

        // Loop through potential divisors from 2 to the square root of the number
        // (No need to check beyond the square root, as divisors come in pairs)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            
            // Check if 'i' is a divisor of the number
            if (number % i == 0) {
                // Add the divisor 'i' to the sum
                sum += i;

                // Check if the divisor 'i' is not the same as the quotient (number / i)
                // If it's not the same, add the quotient as well (this is the paired divisor)
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        // After summing all divisors, check if the sum equals the original number
        // If true, it means the number is perfect
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input

        // Ask the user to input the lower bound of the range
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();  // Read the lower bound (starting number)

        // Ask the user to input the upper bound of the range
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();  // Read the upper bound (ending number)

        // Display a message indicating the range being checked
        System.out.println("Perfect numbers between " + lowerBound + " and " + upperBound + " are:");

        // Loop through all numbers in the specified range (from lowerBound to upperBound)
        for (int i = lowerBound; i <= upperBound; i++) {
            // For each number in the range, check if it is a perfect number using isPerfectNumber()
            if (isPerfectNumber(i)) {
                // If the number is perfect, print it to the console
                System.out.println(i);
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
