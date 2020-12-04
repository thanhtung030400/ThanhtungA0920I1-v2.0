package b2.vong_lap_trong_JAVA.thuc_hanh;

import java.util.Scanner;

public class thiet_ke_menu {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner (System.in);

        System.out.println("menu");
        System.out.println("1. draw the triangle");
        System.out.println("2. draw the square");
        System.out.println("3. draw the rectangle ");
        System.out.println("0. Exit");
        System.out.println("enter your choice");
        choice = scanner.nextInt();


        while (choice != 0){

            switch (choice){
                case 1:
                    System.out.println("1. draw the triangle");
                    System.out.println("*");
                    System.out.println("***");
                    System.out.println("*****");
                    System.out.println("*******");
                    System.out.println("*********");
                    break;
                case 2 :
                    System.out.println("2. draw the square");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    break;
                case 3:
                    System.out.println("3. draw the rectangle ");
                    System.out.println("*********");
                    System.out.println("*********");
                    System.out.println("*********");
                    System.out.println("*********");
                    System.out.println("*********");
                    break;
                case 0:
                    System.exit(0 );
                    default:
                        System.out.println("No choice");
                        break;
            }
            System.out.println("menu");
            System.out.println("1. draw the triangle");
            System.out.println("2. draw the square");
            System.out.println("3. draw the rectangle ");
            System.out.println("0. Exit");
            System.out.println("enter your choice");
            choice = scanner.nextInt();
        }
    }
}
