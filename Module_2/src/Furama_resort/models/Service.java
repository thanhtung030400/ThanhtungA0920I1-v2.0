package Furama_resort.models;

public abstract class Service {
    protected String Id;
    protected String serviceName;
    protected double areUse;
    protected double rentCost;
    protected int numberOfPeople;
    protected String typeRent;

    public  Service(){

    }

    public Service(String id, String serviceName, double areUse, double rentCost, int numberOfPeople, String typeRent) {
        Id = id;
        this.serviceName = serviceName;
        this.areUse = areUse;
        this.rentCost = rentCost;
        this.numberOfPeople = numberOfPeople;
        this.typeRent = typeRent;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreUse() {
        return areUse;
    }

    public void setAreUse(double areUse) {
        this.areUse = areUse;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Service{" +
                "Id='" + Id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areUse=" + areUse +
                ", rentCost=" + rentCost +
                ", numberOfPeople=" + numberOfPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }



    public abstract void showInfor();

}
