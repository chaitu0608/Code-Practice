import java.util.Scanner;


public class LeapYearChecker {


   // Method to check if a year is a leap year
   static boolean isLeapYear(int year) {
       // Leap year is divisible by 400 or divisible by 4 but not by 100
       return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
   }


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       // Input year from the user
       System.out.print("Enter a year: ");
       int year = scanner.nextInt();


       // Check and display whether the year is a leap year
       if (isLeapYear(year)) {
           System.out.println(year + " is a leap year.");
       } else {
           System.out.println(year + " is not a leap year.");
       }


       scanner.close();
   }
}
