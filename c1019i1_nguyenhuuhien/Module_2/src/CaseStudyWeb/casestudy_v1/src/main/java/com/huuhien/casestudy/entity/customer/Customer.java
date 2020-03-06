package com.huuhien.casestudy.entity.customer;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;


    @NotEmpty(message = "Tên Không được để trống! ")
    @Column(name = "full_name")
    private  String fullName;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "birthday")
    private Date birthDay;

    @Column(name = "id_card")
    private int idCard;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "id_type_customer")
    private TypeCustomer typeCustomer;

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
//
//    @OneToMany(targetEntity = Contract.class)
//    private List<Contract> contracts;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        if (this.birthDay==null) return "";
        return  new SimpleDateFormat("dd/MM/yyyy").format(this.birthDay);
    }

    public void setBirthDay(String birthDay) {
        try {
            System.out.println("asdadasdassda"+this.birthDay);
            this.birthDay = new SimpleDateFormat("yyyy-MM-dd").parse(birthDay);

        }catch (ParseException e){
            this.birthDay = null;
        }
        System.out.println("In setter");
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public TypeCustomer getTypeCustomer() {
//        return typeCustomer;
//    }
//
//    public void setTypeCustomer(TypeCustomer typeCustomer) {
//        this.typeCustomer = typeCustomer;
//    }
//
//    public List<Contract> getContracts() {
//        return contracts;
//    }
//
//    public void setContracts(List<Contract> contracts) {
//        this.contracts = contracts;
//    }
    @Override
    public String toString() {
        return "FuramaCustomer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthDay +
                ", id_card='" + idCard + '\'' +
                ", phone_number='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
//                ", furamaTypeCustomer=" + typeCustomer +
                '}';
    }
}
