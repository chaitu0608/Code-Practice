//USING THROWS 
import java.util.Scanner;

// Custom Exception Class
class NumberException extends Exception {
    public NumberException() {}
    
    @Override
    public String toString() {
        return "You chose the wrong number, son";
    }
}

public class Number2 {
    
    // Main method declaring that it throws NumberException
    public static void main(String[] args) throws NumberException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");

        try {
            int number = sc.nextInt();
            checkNumber(number); // Call method that can throw NumberException
            
            System.out.println("You entered a valid number having digit 3 ");
            System.out.println("The number you entered is: " + number);
        } 
        catch (NumberException e) {
            System.out.println(e);
            System.out.println("Number Exception Encountered");  
            System.out.println("The number which you entered is not having digit 3");
        } 
        finally {
            sc.close();
        }
    }
    
    // Method that checks the number and throws NumberException if condition fails
    public static void checkNumber(int number) throws NumberException {
        if (!Integer.toString(number).contains("3")) {
            throw new NumberException(); // Throwing exception if digit 3 is not found
        }
    }
}
