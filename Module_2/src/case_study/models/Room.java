package case_study.models;

public class Room extends Services {

    private String freeServicesInclude;

    public Room(String serviceName, String renType, double usableArea, double costRent, int maxNumOfPeo, String freeServicesInclude) {
        super(serviceName, renType, usableArea, costRent, maxNumOfPeo);
        this.freeServicesInclude = freeServicesInclude;
    }

    public Room(String serviceName, String freeServicesInclude, double usableArea, double costRent, int maxNumOfPeo) {
        this.freeServicesInclude = freeServicesInclude;
    }

    public String getFreeServicesInclude() {
        return freeServicesInclude;
    }

    public void setFreeServicesInclude(String freeServicesInclude) {
        this.freeServicesInclude = freeServicesInclude;
    }

    @Override
    void showInfor() {
        System.out.println("name service" +this.getServiceName() +
                "type rent" + this.getRenType()+
                "usable area" + this.getUsableArea()+
                "price" + this.getCostRent()+
                "num of people" + this.getMaxNumOfPeo()+
                "service include" + this.getFreeServicesInclude());

    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServicesInclude='" + freeServicesInclude + '\'' +
                '}';
    }
}
