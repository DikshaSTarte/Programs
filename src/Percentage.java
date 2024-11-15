import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a percentage
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        // Determine the grade based on the percentage
        if (percentage >= 75 && percentage <= 100) {
            System.out.println("Congrats!! You got Distinction");
        } else if (percentage >= 60 && percentage <= 74) {
            System.out.println("Congrats!! You got First Class");
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Congrats!! You got Second Class");
        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Congrats!! You got Pass Class");
        } else if (percentage >= 0 && percentage <= 39) {
            System.out.println("Sorry!! You are Fail..");
        } else {
            System.out.println("Invalid Percentage");
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}