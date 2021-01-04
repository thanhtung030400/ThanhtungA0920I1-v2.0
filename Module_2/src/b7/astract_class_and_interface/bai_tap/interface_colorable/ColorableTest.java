package b7.astract_class_and_interface.bai_tap.interface_colorable;

import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.shape;
import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.square;

public class ColorableTest {
    public static void main(String[] args) {
        shape square1 = new square(5.0,"blue",false);
        shape square2 = new square(10.0);


        shape[] arr = {square1, square2};

        for (shape ele : arr) {
            if (ele instanceof SquareColorable) {
                square square = (square) ele;
                System.out.println(square.getArea());
                square.howToColor();
            }

        }
    }
}
