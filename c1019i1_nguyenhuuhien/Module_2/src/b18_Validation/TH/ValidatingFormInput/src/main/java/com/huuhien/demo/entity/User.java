package com.huuhien.demo.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
    @NotEmpty
    @Size(min = 2,max = 30)
    @Pattern(regexp = "^[a-z]{5,}@[a-z]{5,}\\.$",message = "Only character are accepted.")
    private String name;

    @Min(18)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
