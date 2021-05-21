package case_study.models;

public class Villa extends Services {

    private String roomStandard;
    private String describeService;
    private double swimmingPoolArea;
    private int numOfFloors;

    public Villa(String serviceName, String renType, double usableArea, double costRent, int maxNumOfPeo, String roomStandard, String describeService, double swimmingPoolArea, Integer numOfFloors) {
        super(serviceName, renType, usableArea, costRent, maxNumOfPeo);
        this.roomStandard = roomStandard;
        this.describeService = describeService;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numOfFloors = numOfFloors;
    }

    public Villa(String roomStandard, String describeService, double swimmingPoolArea, Integer numOfFloors) {
        this.roomStandard = roomStandard;
        this.describeService = describeService;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numOfFloors = numOfFloors;
    }

    public Villa(String serviceName, String renType, double usableArea, double costRent, int maxNumOfPeo, String roomStandard, String describeService, double swimmingPoolArea) {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescribeService() {
        return describeService;
    }

    public void setDescribeService(String describeService) {
        this.describeService = describeService;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public Integer getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(Integer numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", describeService='" + describeService + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numOfFloors=" + numOfFloors +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println("NameService:"+this.getServiceName() +
                "rent type" + this.getRenType() +
                "usable area" + this.getUsableArea()+
                "cost rent" + this.getCostRent()+
                "num of people" + this.getMaxNumOfPeo()+
                "room standard" + this.getRoomStandard()+
                "describe service" +this.getDescribeService()+
                "swimming pool area"+ this.getSwimmingPoolArea()+
                "no of floors" + this.getNumOfFloors());
    }

    //    Room standard, Description of other amenities,
//Swimming pool area, Number of floors.
}
