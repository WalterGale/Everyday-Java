import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    static final int MONTHS_IN_YEAR = 12;
    static final int PERCENTAGE = 100;
    public static void main(String[] args) {

        int loanRequired = (int) scanNumber("Loan amount required: ", 1_000, 1_000_000);
        float annualInterest = scanNumber("Annual interest rate: ", 0, 40);
        int periodInYears = (int) scanNumber("Loan period in years: ", 0, 40);

        float monthlyMortgage = calculateMonthlyMortgage(loanRequired, annualInterest, periodInYears);
        int numberOfPayments = calculateNumberOfPayments(periodInYears, MONTHS_IN_YEAR);
        float totalPayment = calculateTotalPayment(monthlyMortgage, numberOfPayments);
        float interestAccrued = calculateInterestAccrued(totalPayment, loanRequired);

        String monthlyMortgageFormatted = NumberFormat.getCurrencyInstance().format(monthlyMortgage);
        String totalPaymentFormatted = NumberFormat.getCurrencyInstance().format(totalPayment);
        String interestAccruedFormatted = NumberFormat.getCurrencyInstance().format(interestAccrued);

        System.out.println("Monthly mortgage payment: " + monthlyMortgageFormatted);
        System.out.println("Total payment at end of loan: " + totalPaymentFormatted);
        System.out.println("Interest accrued over loan period: " + interestAccruedFormatted);
    }

    public static float scanNumber(String userPrompt, float minimum, float maximum) {

        Scanner scanner = new Scanner(System.in);

        float userInput;

        while (true) {
            System.out.println(userPrompt);
            userInput = scanner.nextFloat();
            if ((userInput >= minimum) && (userInput <= maximum)) {
                break;
            }
            else {
                System.out.println("The value entered should be between " + minimum + " and " + maximum);
            }
        }
        return userInput;
    }

    public static float calculateMonthlyMortgage(int loanRequired, float annualInterest, int periodInYears) {

        float monthlyInterestRate = annualInterest / PERCENTAGE / MONTHS_IN_YEAR;
        int numberOfPayments = (periodInYears * MONTHS_IN_YEAR);

        return (float) (loanRequired
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
    }

    public static float calculateTotalPayment (float monthlyMortgage, int numberOfPayments) {

        return (monthlyMortgage * numberOfPayments);
    }

    public static int calculateNumberOfPayments (int periodInYears, int MONTHS_IN_YEAR) {

        return (periodInYears * MONTHS_IN_YEAR);
    }

    public static float calculateInterestAccrued (float totalPayment, int loanRequired) {

        return (totalPayment - loanRequired);
    }

}