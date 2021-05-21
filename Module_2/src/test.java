import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = scanner.nextDouble();
        System.out.print("Annual interest rate:");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        // Print a table that displays future value for the years from 1 to 30
        System.out.println("Years     Future Value"); // Table header
        for (int i= 1; i <= 30; i++) {
            System.out.printf("%-10d", i);
            System.out.printf("%11.2f\n", futureInvestmentValue(amount, monthlyInterestRate, i));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}