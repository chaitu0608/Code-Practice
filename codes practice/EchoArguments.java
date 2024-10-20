public class EchoArguments {
    public static void main(String[] args) {
        // Check if there are any command-line arguments
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments are:");
            // Loop through all the arguments and print each one on a new line
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}