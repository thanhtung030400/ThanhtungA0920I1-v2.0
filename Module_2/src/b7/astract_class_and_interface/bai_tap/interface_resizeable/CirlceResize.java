package b7.astract_class_and_interface.bai_tap.interface_resizeable;

import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.circle;

public class CirlceResize extends circle implements Resizeable {

    @Override
    public void resize(double percent) {
        setRadius(getRadius()+(getRadius() * (percent/100)));
    }

    @Override
    public String toString() {
        return "A circle with radius = " +
                getRadius() +
                ", which is a subclass of " +
                super.toString();
    }
}
