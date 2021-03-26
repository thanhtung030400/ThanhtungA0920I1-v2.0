package final_test.models;

public class Truck extends Vehicle{
    private int payLoad;

    public Truck(int licensePlates, String brand, int yearOfProduction, String owner, int payLoad) {
        super(licensePlates, brand, yearOfProduction, owner);
        this.payLoad = payLoad;
    }

    public Truck(){
    }

    public int getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(int payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payLoad=" + payLoad +
                '}';
    }

    @Override
    public void showInformation() {

    }
}
