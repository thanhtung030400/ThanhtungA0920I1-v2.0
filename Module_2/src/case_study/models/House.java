package case_study.models;

public class House extends Services {

    private String roomStandard, DescribeService;
    private Integer numOfFloors;

    public House(String serviceName, String renType, double usableArea, double costRent, int maxNumOfPeo, String roomStandard, String describeService, Integer numOfFloors) {
        super(serviceName, renType, usableArea, costRent, maxNumOfPeo);
        this.roomStandard = roomStandard;
        DescribeService = describeService;
        this.numOfFloors = numOfFloors;
    }

    public House(String roomStandard, String describeService, double usableArea, double costRent, Integer numOfFloors, String standard, String service, String numOfFloor) {
        this.roomStandard = roomStandard;
        DescribeService = describeService;
        this.numOfFloors = numOfFloors;
    }

    public House(String serviceName, String renType, double usableArea, double costRent, int maxNumOfPeo, String roomStandard, String describeService) {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescribeService() {
        return DescribeService;
    }

    public void setDescribeService(String describeService) {
        DescribeService = describeService;
    }

    public Integer getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(Integer numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    void showInfor() {
        System.out.println("name service" + this.getServiceName() +
                "rentType" + this.getRenType()+
                "usable area" + this.getUsableArea()+
                "cost per day" + this.getCostRent()+
                "num of people" + this.getMaxNumOfPeo()+
                "room standard" + this.getRoomStandard()+
                "describe service" + this.getDescribeService()+
                "floor" + this.getNumOfFloors());
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", DescribeService='" + DescribeService + '\'' +
                ", numOfFloors=" + numOfFloors +
                '}';
    }

    //Room Standard, Description of other amenities,
    //Number of floors.
}
