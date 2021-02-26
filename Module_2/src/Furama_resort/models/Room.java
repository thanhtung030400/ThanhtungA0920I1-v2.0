package Furama_resort.models;

public class Room extends Service {

    private ExtraService extraService;

    public Room(){

    }

    public Room(String id, String serviceName, double areUse, double rentCost, int numberOfPeople, String typeRent, ExtraService extraService) {
        super(id, serviceName, areUse, rentCost, numberOfPeople, typeRent);
        this.extraService = extraService;
    }

    public ExtraService getExtraService() {
        return extraService;
    }

    public void setExtraService(ExtraService extraService) {
        this.extraService = extraService;
    }

    @Override
    public String
    toString() {
        return "Room{" +
                "extraService=" + extraService +
               '}'+super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
