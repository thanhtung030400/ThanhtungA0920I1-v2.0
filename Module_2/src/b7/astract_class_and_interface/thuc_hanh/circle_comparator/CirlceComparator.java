package b7.astract_class_and_interface.thuc_hanh.circle_comparator;

import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.circle;
import javafx.scene.shape.Circle;

import java.util.Comparator;

public class CirlceComparator implements Comparator<circle> {

    public CirlceComparator(double v, String indigo, boolean b) {
    }

    public CirlceComparator(double v) {
    }

    public CirlceComparator() {

    }


    @Override
    public int compare(circle circle, circle t1) {
        if (circle.getRadius() > t1.getRadius())
            return 1;
        else if (circle.getRadius() < t1.getRadius())
            return -1;
        else
            return 0;
    }
}
