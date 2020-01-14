package CaseStudyModule2.Models;

public class Employee {
    String fullName;
    int age;
    String address;

    public Employee(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public Employee() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name : " + getFullName() + "\tAge : " + getAge()  + "\tAddress : " + getAddress();
    }

    public String showInfo() {
        return "Name : " + getFullName() + "\tAge : " + getAge()  + "\tAddress : " + getAddress();
    }
}
