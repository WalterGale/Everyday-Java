import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired number: ");

    // using a for loop for "i <= 100" will provide a desired output of either Fizz, Buzz or i for all integers between the one provided and 100
    for (int i = scanner.nextInt(); i <= 100; i++) {
        switch (i % 15) {
            case 0:
                System.out.println("FizzBuzz");
                break;
            case 3: case 6: case 9: case 12:
                System.out.println("Buzz");
                break;
            case 5: case 10:
                System.out.println("Fizz");
                break;
            default:
                System.out.println(i);
            }
        }
    }
}
