package b5.access_modifier_static_method_and_static_property.bai_tap.access_modifier;

import java.awt.geom.Area;

public class Circle {
    private double radius;
    private String color;


    public Circle() {
        this(1.0,"red");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius*radius*3.14;
    }
}

