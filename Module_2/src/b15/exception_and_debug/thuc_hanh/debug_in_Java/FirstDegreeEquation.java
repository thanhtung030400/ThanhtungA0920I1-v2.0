package b15.exception_and_debug.thuc_hanh.debug_in_Java;

import java.util.Scanner;

public class FirstDegreeEquation {

    public static void main(String[] args) {


        System.out.println("First Degree Equation Computer");
        System.out.println("Given a equation as 'a*x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
