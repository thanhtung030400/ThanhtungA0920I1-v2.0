package b7.astract_class_and_interface.thuc_hanh.circle_comparator;

import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.circle;
import javafx.scene.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CirlceCorparatorTest {
    public static void main(String[] args) {
        circle[] circles = new circle[3];
        circles[0] = new circle(3.6);
        circles[1] = new circle();
        circles[2] = new circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CirlceComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (circle circle : circles) {
            System.out.println(circle);
        }
    }
}
