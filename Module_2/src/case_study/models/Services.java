package case_study.models;

public abstract class Services {

    private String serviceName, renType ;
    private double usableArea, costRent;
    private int maxNumOfPeo;

    public Services(String serviceName, String renType, double usableArea, double costRent, int maxNumOfPeo) {
        this.serviceName = serviceName;
        this.renType = renType;
        this.usableArea = usableArea;
        this.costRent = costRent;
        this.maxNumOfPeo = maxNumOfPeo;
    }

    public Services() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getRenType() {
        return renType;
    }

    public void setRenType(String renType) {
        this.renType = renType;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public int getMaxNumOfPeo() {
        return maxNumOfPeo;
    }

    public void setMaxNumOfPeo(int maxNumOfPeo) {
        this.maxNumOfPeo = maxNumOfPeo;
    }

    @Override
    public String toString() {
        return "Services{" +
                "serviceName='" + serviceName + '\'' +
                ", renType='" + renType + '\'' +
                ", usableArea=" + usableArea +
                ", costRent=" + costRent +
                ", maxNumOfPeo=" + maxNumOfPeo +
                '}';
    }

    protected abstract void showInfor();
}
