import java.util.Scanner;

public class Main{
    public float divide(float zähler, float nenner) {
        return zähler / nenner;
    }

    public static void main(String[] args) {
        // Use try-with-resources to automatically close the Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Ask the user for zähler and nenner
            System.out.print("Enter the value for zähler: ");
            float zähler = scanner.nextFloat();

            System.out.print("Enter the value for nenner: ");
            float nenner = scanner.nextFloat();

            // Create an instance of HelloWorld to call the divide method
            Main helloWorld = new Main();

            // Call the divide method and display the result
            if (nenner != 0) {  // Check for division by zero
                float result = helloWorld.divide(zähler, nenner);
                System.out.println("The result of division is: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }

        } catch (Exception e) {
            // Catch any exceptions and print the error
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
