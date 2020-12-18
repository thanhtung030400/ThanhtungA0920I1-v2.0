package b5.access_modifier_static_method_and_static_property.thuc_hanh.static_property;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCar;

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

}