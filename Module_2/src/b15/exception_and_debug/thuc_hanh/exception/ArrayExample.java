package b15.exception_and_debug.thuc_hanh.exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom(){
        Random ramdom= new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang");
        for (int i = 0; i < 100; i ++){
            arr[i] = ramdom.nextInt(100);
            System.out.println(arr[i]+ "");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        Scanner scanner= new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ:");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trij của phần tử có chỉ số 5" + x+"là" + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vựơt quá giới hạn của mảng");
        }
    }
}
