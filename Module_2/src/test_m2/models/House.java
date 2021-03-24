package test_m2.models;

public class House extends Service {
    private String standerRoom;
    private String otherDescription;
    private int numberOfFloor;

    public House(){
    }

    public House(String id, String service, double areaUsed, double rentCost, int numberOfPeople, String typeRent, String standerRoom, String otherDescription, int numberOfFloor) {
        super(id, service, areaUsed, rentCost, numberOfPeople, typeRent);
        this.standerRoom = standerRoom;
        this.otherDescription = otherDescription;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStanderRoom() {
        return standerRoom;
    }

    public void setStanderRoom(String standerRoom) {
        this.standerRoom = standerRoom;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standerRoom='" + standerRoom + '\'' +
                ", otherDescription='" + otherDescription + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
