package b15.exception_and_debug.thuc_hanh.number_format_exception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("press x:");
            int x = scanner.nextInt();
            System.out.println();
            int y = scanner.nextInt();
        CalculationExample calculationExample= new CalculationExample();
        calculationExample(x,y);
    }

    private static void calculationExample(int x, int y) {
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("add x+y = " + a);
            System.out.println("minus x-y =" +b);
            System.out.println("multiply x*y =" +c);
            System.out.println("devide x/y =" +d);
        }catch (Exception e){
            System.out.println("exception" + e.getMessage());
        }
    }
}
