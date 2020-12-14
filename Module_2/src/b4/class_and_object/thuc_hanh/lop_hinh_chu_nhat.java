package b4.class_and_object.thuc_hanh;


import java.util.Scanner;

public class lop_hinh_chu_nhat {
    double width, height;

    public lop_hinh_chu_nhat() {
    }

    public lop_hinh_chu_nhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height" + height + "}";
    }

    public static class Ex14_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter Width :");
            double width = scanner.nextDouble();
            System.out.print("enter Height");
            double height = scanner.nextDouble();

            lop_hinh_chu_nhat rectangle = new lop_hinh_chu_nhat(width, height);
            System.out.println("Your Rectangle \n" + rectangle.display());
            System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
            System.out.println("Area of the Rectangle: " + rectangle.getArea());

        }
    }
}
