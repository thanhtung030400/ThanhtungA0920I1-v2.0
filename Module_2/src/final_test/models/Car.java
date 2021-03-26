package final_test.models;

public class Car extends  Vehicle{
    private int numOfSeat;
    private String models;

    public Car(){
    }

    public Car(int licensePlates, String brand, int yearOfProduction, String owner, int numOfSeat) {
        super(licensePlates, brand, yearOfProduction, owner);
        this.numOfSeat = numOfSeat;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }


    @Override
    public String toString() {
        return "Car{" +
                "numOfSeat=" + numOfSeat +
                ", models='" + models + '\'' +
                '}';
    }

    @Override
    public void showInformation() {

    }
}
