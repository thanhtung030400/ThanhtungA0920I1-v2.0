package b6.ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

import b5.access_modifier_static_method_and_static_property.bai_tap.access_modifier.Circle;

public class circle extends shape {
    private double radius = 1.0;

    public circle(){
    }

    public circle(double radius){
        this.radius = radius;
    }

    public circle (double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius" + getRadius() +",which is a subclass of" + super.toString();
    }

}
