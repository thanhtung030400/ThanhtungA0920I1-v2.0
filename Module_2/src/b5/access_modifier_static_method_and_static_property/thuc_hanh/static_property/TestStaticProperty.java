package b5.access_modifier_static_method_and_static_property.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mazda 3", "skyactive 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("mazda 6", "skyactive 6");
        System.out.println(Car.numberOfCar);
    }
}
