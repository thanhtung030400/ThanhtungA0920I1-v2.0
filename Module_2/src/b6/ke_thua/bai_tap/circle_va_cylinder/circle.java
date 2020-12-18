package b6.ke_thua.bai_tap.circle_va_cylinder;

public class circle{
    private String color = "red";
    private double radius = 1.0;

    public circle(){
    }

    public circle(String color, double radius) {
        this.color= color;
        this.radius=radius;
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

    private double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius" + getRadius() +",which is a mainclass of" + super.toString();
    }
}
