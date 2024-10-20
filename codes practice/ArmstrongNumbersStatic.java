import java.util.Scanner;

public class ArmstrongNumbersStatic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    // Static method to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = Integer.toString(number).length();

        while (number != 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, digits);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
