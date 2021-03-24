package test_m2.models;

public class Room extends Service{
    private ExtraService extraservice;

    public Room() {
    }

    public Room(String id, String service, double areaUsed, double rentCost, int numberOfPeople, String typeRent, ExtraService extraservice) {
        super(id, service, areaUsed, rentCost, numberOfPeople, typeRent);
        this.extraservice = extraservice;
    }

    public ExtraService getExtraservice() {
        return extraservice;
    }

    public void setExtraservice(ExtraService extraservice) {
        this.extraservice = extraservice;
    }

    @Override
    public void showInfor() {

    }

    @Override
    public String toString() {
        return "Room{" +
                "extraservice=" + extraservice +
                '}'+super.toString();
    }
}
