import java.util.Scanner;

public class testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter x");
        double x = scanner.nextDouble();
        double Width = Math.pow(x * x, 0.5D);
        System.out.println(x);

    }
}

