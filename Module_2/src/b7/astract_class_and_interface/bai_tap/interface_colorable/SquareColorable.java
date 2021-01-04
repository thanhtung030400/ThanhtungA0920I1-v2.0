package b7.astract_class_and_interface.bai_tap.interface_colorable;

import b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc.square;

public class SquareColorable extends square implements howToColor {
    @Override
    public void color() {
        System.out.println("Color all four sides.." );
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
