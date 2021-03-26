package final_test.models;



public abstract class Vehicle {
    protected int licensePlates;
    protected String brand;
    protected int yearOfProduction;
    protected String owner;

    public Vehicle(int licensePlates, String brand, int yearOfProduction, String owner) {
        this.licensePlates = licensePlates;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.owner = owner;
    }

    public Vehicle() {
    }

    public int getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(int licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlates=" + licensePlates +
                ", brand='" + brand + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", owner='" + owner + '\'' +
                '}';
    }

    public  abstract  void showInformation();

}
