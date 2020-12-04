package b2.vong_lap_trong_JAVA.thuc_hanh;

import java.util.Scanner;

public class uoc_so_chung {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("enter a");
        a = scanner.nextInt();
        System.out.println("enter b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 ||b==0){
            System.out.println("no great common master");
        }
        while (a != b){
            if (a > b ){
                a = a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("greate common master" + a);
    }
}
