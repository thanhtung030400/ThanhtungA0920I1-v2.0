package b4.class_and_object.bai_tap;

import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a:");
        double a = scanner.nextDouble();
        System.out.print("nhap b:");
        double b = scanner.nextDouble();
        System.out.print("nhap c:");
        double c = scanner.nextDouble();
        QuadraticEquation x = new QuadraticEquation(a,b,c);
        x.getDelta();
        if (x.getDelta() > 0){
            System.out.print("nghiem 1" );
        }
    }

    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return this.b * this.b - 4 * this.a * this.c;
    }


}
