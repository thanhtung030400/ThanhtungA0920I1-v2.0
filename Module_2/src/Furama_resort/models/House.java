package Furama_resort.models;

public class House extends Service {
    private String standardRoom;
    private String otherDescription;
    private int numberOfFloors;

    public House() {

    }

    public House(String id, String serviceName, double areUse, double rentCost, int numberOfPeople, String typeRent, String standardRoom, String otherDescription, int numberOfFloors) {
        super(id, serviceName, areUse, rentCost, numberOfPeople, typeRent);
        this.standardRoom = standardRoom;
        this.otherDescription = otherDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", otherDescription='" + otherDescription + '\'' +
                ", numberOfFloors=" + numberOfFloors +
               '}'+super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
