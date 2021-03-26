package final_test.models;

public class Motorcycle extends Vehicle {
    private int wattage;

    public Motorcycle(int licensePlates, String brand, int yearOfProduction, String owner, int wattage) {
        super(licensePlates, brand, yearOfProduction, owner);
        this.wattage = wattage;
    }

    public Motorcycle() {
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wattage=" + wattage +
                '}';
    }

    @Override
    public void showInformation() {

    }
}
