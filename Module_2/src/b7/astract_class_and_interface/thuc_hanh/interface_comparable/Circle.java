package b7.astract_class_and_interface.thuc_hanh.interface_comparable;



public class Circle {
    private double radius = 1.0;

    public Circle(){
    }

    public Circle(double radius){
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

