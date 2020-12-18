package b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class rectangleTest {
    public static void main(String[] args) {
        rectangle rectangle = new rectangle();
        System.out.println(rectangle);

        rectangle  = new rectangle(2.3,5.8);
        System.out.println(rectangle);

        rectangle = new rectangle(2.5,3.8,"orange",true);
        System.out.println(rectangle);
    }
}
