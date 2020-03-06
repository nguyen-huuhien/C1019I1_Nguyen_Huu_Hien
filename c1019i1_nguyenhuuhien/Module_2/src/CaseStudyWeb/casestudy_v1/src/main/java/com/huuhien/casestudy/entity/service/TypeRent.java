package com.huuhien.casestudy.entity.service;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_rent")
public class TypeRent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_rent")
    private Long idTypeRent;

    @Column(name = "name_type_rent")
    private String nameTypeRent;

    @OneToMany(targetEntity = Service.class)
    private List<Service> typeRentList;

    public TypeRent() {
    }

    public Long getIdTypeRent() {
        return idTypeRent;
    }

    public void setIdTypeRent(Long idTypeRent) {
        this.idTypeRent = idTypeRent;
    }

    public String getNameTypeRent() {
        return nameTypeRent;
    }

    public void setNameTypeRent(String nameTypeRent) {
        this.nameTypeRent = nameTypeRent;
    }

    public List<Service> getService() {
        return typeRentList;
    }

    public void setService(List<Service> service) {
        this.typeRentList = service;
    }


}
