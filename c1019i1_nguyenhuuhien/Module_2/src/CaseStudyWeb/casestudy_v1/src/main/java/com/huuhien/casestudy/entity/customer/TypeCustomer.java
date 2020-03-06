package com.huuhien.casestudy.entity.customer;

import com.huuhien.casestudy.entity.customer.Customer;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_customer")
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_customer")
    private Long idTypeCustomer;

    @Column(name = "name_type_customer")
    private String nameTypeCustomer;

    @OneToMany(targetEntity = Customer.class)
    private List<Customer> customers;

    public TypeCustomer() {
    }

    public Long getIdTypeCustomer() {
        return idTypeCustomer;
    }

    public void setIdTypeCustomer(Long idTypeCustomer) {
        this.idTypeCustomer = idTypeCustomer;
    }

    public String getNameTypeCustomer() {
        return nameTypeCustomer;
    }

    public void setNameTypeCustomer(String nameTypeCustomer) {
        this.nameTypeCustomer = nameTypeCustomer;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
