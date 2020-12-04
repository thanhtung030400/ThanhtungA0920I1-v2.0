package b2.vong_lap_trong_JAVA.bai_tap;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. draw the top triangle");
        System.out.println("2. draw the rectangle");
        System.out.println("3. draw the bottom triangle");
        choice = scanner.nextInt();


        // top triangle
        switch (choice) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (j <= i)
                            System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            // rectangle

            case 2:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            //bottom triangle

            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (i <= j)
                            System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }
    }
}




