package b2.vong_lap_trong_JAVA.thuc_hanh;

import java.util.Scanner;

public class so_nguyen_to {
    public static void main(String[] args){
        Scanner scanner=  new Scanner(System.in);
        System.out.println("enter your number:");
        int number = scanner.nextInt();
        if(number < 2) {
            System.out.println(number + "is not this number");
        }else{
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check) {
                System.out.println(number + "is a prime");
            }else {
                System.out.println(number + "is not a prime");
            }
        }
    }
}
