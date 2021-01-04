package b7.astract_class_and_interface.thuc_hanh.interface_comparable;

import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.circle;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.util.Comparator;

public class ComparableCircle extends circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color,boolean filled){
        super(radius,color,filled);
    }

    @Override
    public int compareTo(ComparableCircle comparableCircle) {
        return 0;
    }



}
