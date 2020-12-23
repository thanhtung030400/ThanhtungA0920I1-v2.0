package b6.ke_thua.bai_tap.create_triangle_class;

import java.util.Scanner;

public class triangleTest {
    public static void main(String[] args) {
        shape shape = new shape();
        System.out.println(shape);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter side 1");
        double size1 = scanner.nextDouble();
        System.out.println("enter side 2");
        double size2 = scanner.nextDouble();
        System.out.println("enter side 3");
        double size3 = scanner.nextDouble();
        System.out.println("enter color");
        String color = scanner.next();

        triangle triangle = new triangle(size1,size2,size3,color);
        System.out.println(triangle);
    }
}

