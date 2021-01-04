package b7.astract_class_and_interface.bai_tap.interface_resizeable;

import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.rectangle;

public class RectangleResize extends rectangle implements Resizeable {
    @Override
    public void resize(double percent) {
        setLength(getLength()+(getLength()*(percent/100)));
        setWidth(getWidth()+(getWidth()*(percent/100)));
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
