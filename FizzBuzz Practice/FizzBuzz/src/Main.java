import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // instantiating a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a desired number: ");
        int number = scanner.nextInt();

        // using a nested if else statement to provide the desired output
        if (number % 5 == 0) {
            if ((number % 5 == 0) && (number % 3 == 0)) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println("Fizz");
            }
        }
        else if (number % 3 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }
    }
}