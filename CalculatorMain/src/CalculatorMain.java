import java.util.Scanner;

// Main class
public class CalculatorMain {
    public static void main(String[] args) {
        // Call the performCalculation method
        performCalculation();
    }

    // Method to perform the calculation
    private static void performCalculation() {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for calculation choice
        System.out.println("Choose a calculation by typing 1, 2, 3 or 4 followed by the enter key: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Get user input
        int choice = scanner.nextInt();

        // Get numbers for the calculation
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform the selected calculation based on user choice
        double result = 0.0;
        switch (choice) {
            case 1:
                result = new Addition().add(num1, num2);
                break;
            case 2:
                result = new Subtraction().subtract(num1, num2);
                break;
            case 3:
                result = new Multiplication().multiply(num1, num2);
                break;
            case 4:
                result = new Division().divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        // Display result
        System.out.println("Result: " + result);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
