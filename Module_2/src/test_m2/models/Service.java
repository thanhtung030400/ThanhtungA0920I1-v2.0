package test_m2.models;

public abstract class Service {
    protected String id;
    protected String service;
    protected double areaUsed;
    protected double rentCost;
    protected int numberOfPeople;
    protected String typeRent;

    public Service() {
    }

    public Service(String id, String service, double areaUsed, double rentCost, int numberOfPeople, String typeRent) {
        this.id = id;
        this.service = service;
        this.areaUsed = areaUsed;
        this.rentCost = rentCost;
        this.numberOfPeople = numberOfPeople;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
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
                "id='" + id + '\'' +
                ", service='" + service + '\'' +
                ", areaUsed=" + areaUsed +
                ", rentCost=" + rentCost +
                ", numberOfPeople=" + numberOfPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }

    public abstract void showInfor();


}
