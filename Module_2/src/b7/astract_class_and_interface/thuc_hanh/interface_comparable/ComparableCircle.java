package b7.astract_class_and_interface.thuc_hanh.interface_comparable;

import javafx.scene.shape.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle comparableCircle) {
        return 0;
    }
}
