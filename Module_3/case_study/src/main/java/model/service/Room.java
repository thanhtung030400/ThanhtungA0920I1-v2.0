package model.service;

public class Room extends Villa {
    private String freeServiceInclude;

    public Room(String serviceName, int serviceArea, int serviceCost, int serviceMaxPeople, String rentTypeId, String standardRoom, String descriptionOtherConvenience, int poolArea, int numberOfFloor, String freeServiceInclude) {
        super(serviceName, serviceArea, serviceCost, serviceMaxPeople, rentTypeId, standardRoom, descriptionOtherConvenience, poolArea, numberOfFloor);
        this.freeServiceInclude = freeServiceInclude;
    }

    public Room() {
    }

    public String getFreeServiceInclude() {
        return freeServiceInclude;
    }

    public void setFreeServiceInclude(String freeServiceInclude) {
        this.freeServiceInclude = freeServiceInclude;
    }
}
