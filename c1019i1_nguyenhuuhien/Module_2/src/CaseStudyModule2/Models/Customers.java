package CaseStudyModule2.Models;

public class Customers {
    private String id;
    private String name;
    private String birthday;
    private String gender;
    private int cmndNumber;
    private double phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private Services services;

    public Customers(String id, String name, String birthday, String gender, int cmndNumber, double phoneNumber, String email, String typeCustomer, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.cmndNumber = cmndNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customers(String name, double phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Customers() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCmndNumber() {
        return cmndNumber;
    }

    public void setCmndNumber(int cmndNumber) {
        this.cmndNumber = cmndNumber;
    }

    public int getPhoneNumber() {
        return (int) phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfo() {
        return "-----------------\n" +
                "\tCustomer : " + getName() + "\n" +
                "1. ID : " + getId() + "\n" +
                "2. Name : " + getName() + "\n" +
                "3. Birthday : " + getBirthday() + "\n" +
                "4. Gender : " + getGender() + "\n" +
                "5. CMND number : " + getCmndNumber() + "\n" +
                "6. Phone number : " + getPhoneNumber() + "\n" +
                "7. Email : " + getEmail() + "\n" +
                "8. Type customer : " + getTypeCustomer() + "\n" +
                "9. Address : " + getAddress() + "\n" +
                "-----------------\n" ;
    }

    public String showBook4D() {
        return "Name : " + getName() +"\tPhone Number : " + getPhoneNumber();
    }


}
