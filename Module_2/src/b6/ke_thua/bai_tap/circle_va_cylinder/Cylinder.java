package b6.ke_thua.bai_tap.circle_va_cylinder;

public class Cylinder extends circle {
    private double height = 5;

    public Cylinder(){
    }

    public Cylinder(double height){this.height = height;}

    public Cylinder(double radius, double height, String color){
        super(color, radius);
        this.height= height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter(){
        return Math.PI* super.getRadius()*super.getRadius()*height;
    }

    public double getArea(){
        return 2* Math.PI *  super.getRadius() *(height+super.getRadius());
    }
    //2 π x r x (r + h)

    @Override
    public String toString() {
        return "A clinder with radius" + getRadius() + ".The Area is" +getArea() +".The perimeter is" + getPerimeter();
    }
}
