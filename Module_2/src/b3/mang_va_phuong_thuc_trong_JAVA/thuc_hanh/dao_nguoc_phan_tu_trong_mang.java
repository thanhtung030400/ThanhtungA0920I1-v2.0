package b3.mang_va_phuong_thuc_trong_JAVA.thuc_hanh;

import java.util.Scanner;

public class dao_nguoc_phan_tu_trong_mang {
    public static void main(String[] args) {
        System.out.println("The application reverses the element of the array");

        int size = 0;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
          System.out.print("enter a size:");
          size = scanner.nextInt();
        }while (size>20 || size<0);

        array =new int[size];
        for (int i = 0;i < array.length ; i++){
            System.out.print("enter element" + (i+1)+":");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // array reverse
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.println();
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

//        do {
//            System.out.print("Enter a size: ");
//            size = scanner.nextInt();
//            if (size > 20)
//                System.out.println("Size does not exceed 20");
//        } while (size > 20);
//
//        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.print("Enter element " + (i + 1) + " :");
//            array[i] = scanner.nextInt();
//            i++;
//        }
//
//        System.out.printf("%-20s%s", "Elements in array: ", "");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
//
//        // array reverse
//        for (int j = 0; j < array.length / 2; j++) {
//            int temp = array[j];
//            array[j] = array[size - 1 - j];
//            array[size - 1 - j] = temp;
//        }
//
//        System.out.println();
//        System.out.printf("%-20s%s", "Reverse array: ", "");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
    }
}

