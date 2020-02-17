package model;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private int id;
    private String name;
    private String year;
    private String origin;




    public Product(int id, String name, String year, String origin) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.origin = origin;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
