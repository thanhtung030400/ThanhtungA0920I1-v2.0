package b7.astract_class_and_interface.bai_tap.interface_resizeable;

import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.circle;
import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.shape;
import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.square;

public class ResizeableTest {
    public static void main(String[] args) {
        shape[] arr = {new square(6), new circle(6)};

        for (shape shape : arr) {
            double random = Math.random();

            if (shape instanceof square) {
                System.out.println("area before: " + ((square) shape).getArea());
                ((square) shape).resize(random * 100);
                System.out.println("area after: " + ((square) shape).getArea());
            }
            if (shape instanceof circle) {
                System.out.println("area before " + ((circle) shape).getArea());
                ((circle) shape).resize(random * 100);
                System.out.println("area after: " + ((circle) shape).getArea());
            }
        }
    }
}
