package b1.introduction_to_JAVA.bai_tap;
import java.util.Scanner;
public class chuyenn_doi_tien_te {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien:");
        USD= scanner.nextDouble();
        double swtich = USD *23000;
        System.out.println(swtich);

    }
}
