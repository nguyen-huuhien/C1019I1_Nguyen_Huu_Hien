package Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    private String name;
    private String bithday;
    private String address;
    private String picture;

    public static List<Customer> listCustomer;

    static {
        listCustomer = new ArrayList<>();
        listCustomer.add(new Customer("Nguyen Huu Hien","10/10/2010","QN","image/img1.jpg"));
        listCustomer.add(new Customer("Nguyen Huu Hien","10/10/2010","QN","image/img2.jpg"));
        listCustomer.add(new Customer("Nguyen Huu Hien","10/10/2010","QN","image/img3.jpg"));
        listCustomer.add(new Customer("Nguyen Huu Hien","10/10/2010","QN","image/img4.jpg"));

    }

    public static List<Customer> getListCustomer() {
        return  listCustomer;
    }

    public Customer(String name, String bithday, String address, String picture) {
        this.name = name;
        this.bithday = bithday;
        this.address = address;
        this.picture = picture;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBithday() {
        return bithday;
    }

    public void setBithday(String bithday) {
        this.bithday = bithday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
