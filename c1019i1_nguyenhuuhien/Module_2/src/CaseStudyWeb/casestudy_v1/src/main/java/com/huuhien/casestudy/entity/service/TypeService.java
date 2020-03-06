package com.huuhien.casestudy.entity.service;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_service")
public class TypeService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_sevice")
    private Long idTypeService;

    @Column(name = "name_type_service")
    private String nameTypeService;

    @OneToMany(targetEntity = Service.class)
    private List<Service> typeServiceList;

    public TypeService() {
    }

    public Long getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(Long idTypeService) {
        this.idTypeService = idTypeService;
    }

    public String getNameTypeService() {
        return nameTypeService;
    }

    public void setNameTypeService(String nameTypeService) {
        this.nameTypeService = nameTypeService;
    }

    public List<Service> getTypeServiceList() {
        return typeServiceList;
    }

    public void setTypeServiceList(List<Service> typeServiceList) {
        this.typeServiceList = typeServiceList;
    }
}
