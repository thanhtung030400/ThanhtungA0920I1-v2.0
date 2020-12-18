package b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class square_test {
    public static void main(String[] args) {
        square square = new square();
        System.out.println(square);

        square = new square(2.3);
        System.out.println(square);

        square = new square(5.8, "yellow", true);
        System.out.println(square);
    }
}
