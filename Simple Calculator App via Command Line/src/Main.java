import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        // storage of 2 numbers
        double num1;
        double num2;
        double result = 0;

        // Accept user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter 2 numbers
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();


        // list back the numbers provided
        System.out.println("The numbers provided were: " + num1 + " and " + num2);
        System.out.println();

        // Enter the desired operator
        System.out.print("Enter the desired operator (+, -, *, /): ");
        String operator = scanner.next();

        // Switch board for the desired operator
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                result = num1 / num2;
                break;

            default:
                System.out.println("The provided operator was invalid. Try again with a valid operator.");
        }

        // Print the result
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        System.out.println();
        System.out.println("The result of your calculation is: " + result);
        System.out.println();
    }
}