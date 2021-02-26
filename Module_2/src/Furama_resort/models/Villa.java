package Furama_resort.models;

import case_study.models.Services;

public class Villa extends Service {

    private String standardRoom;
    private String otherDescription;
    private double areaPool;
    private int numberOfFloors;

    public Villa (){

    }

    public Villa(String id, String serviceName, double areUse, double rentCost, int numberOfPeople, String typeRent, String standardRoom, String otherDescription, double areaPool, int numberOfFloors) {
        super(id, serviceName, areUse, rentCost, numberOfPeople, typeRent);
        this.standardRoom = standardRoom;
        this.otherDescription = otherDescription;
        this.areaPool = areaPool;
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", otherDescription='" + otherDescription + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloors=" + numberOfFloors +
               '}'+ super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
