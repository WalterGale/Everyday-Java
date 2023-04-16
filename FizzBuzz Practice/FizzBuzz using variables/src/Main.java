import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCommonDivisor;
        int secondCommonDivisor;
        int functionLimit;

        System.out.println("Enter the function limit: ");
        functionLimit = scanner.nextInt();

        System.out.println("Enter the first common divisor: ");
        firstCommonDivisor = scanner.nextInt();

        System.out.println("Enter the second common divisor: ");
        secondCommonDivisor = scanner.nextInt();

        System.out.println("");

        int productOfDivisor = firstCommonDivisor * secondCommonDivisor;

        for ( int i = 1; i <= functionLimit; i++) {
        String output = "";

        if (i % productOfDivisor == 0) {
            System.out.println("FizzBuzz");
            continue;
        }
        if ( i % firstCommonDivisor == 0 ) {
            System.out.println(output += "Fizz");
        }
        if ( i % secondCommonDivisor == 0) {
            System.out.println(output += "Buzz");
        }
        if ( output == "") {
            System.out.println(i);
        }
        }

    }
}