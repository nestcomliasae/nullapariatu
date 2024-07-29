import java.util.Scanner;

public class AgeInputExample {
    public static void main(String[] args) {
        // Create a Scanner object linked to System.in (standard input)
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("Please enter your age: ");

        // Read an integer from the user
        int age = scanner.nextInt();

        // Display the entered age
        System.out.println("You entered: " + age);

        // Close the scanner
        scanner.close();
    }
}
