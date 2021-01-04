package b7.astract_class_and_interface.bai_tap.interface_resizeable;

import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.square;

public class SquareResize extends square implements Resizeable {
    @Override
    public void resize(double percent) {
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of " +
                super.toString();
    }
}
