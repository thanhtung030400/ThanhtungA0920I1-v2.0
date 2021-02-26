package Furama_resort.models;

public class Customer {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Service service;

    public Customer(String fullName, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String typeOfCustomer, String address, Service service) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.service = service;
    }

    public Customer() {
    }

    public void showInfor(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", service=" + service +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
