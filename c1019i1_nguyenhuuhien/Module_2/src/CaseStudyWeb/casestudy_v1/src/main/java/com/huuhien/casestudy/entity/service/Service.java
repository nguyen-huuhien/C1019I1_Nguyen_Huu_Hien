package com.huuhien.casestudy.entity.service;

import javax.persistence.*;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service")
    private Long idService;

    @Column(name = "name_service")
    private String nameService;

    @Column(name = "area_serivce")
    private String areaService;

    @Column(name = "maxnumber_service")
    private int maxNumberService;

    @Column(name = "price_rent_service")
    private double priceRentService;

    @Column(name = "status_service")
    private String statusService;

    @ManyToOne
    @JoinColumn(name = "type_rent")
    private TypeRent typeRent;

    @ManyToOne
    @JoinColumn(name = "type_service")
    private TypeService typeService;

    public Service() {
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getAreaService() {
        return areaService;
    }

    public void setAreaService(String areaService) {
        this.areaService = areaService;
    }

    public int getMaxNumberService() {
        return maxNumberService;
    }

    public void setMaxNumberService(int maxNumberService) {
        this.maxNumberService = maxNumberService;
    }

    public double getPriceRentService() {
        return priceRentService;
    }

    public void setPriceRentService(double priceRentService) {
        this.priceRentService = priceRentService;
    }

    public String getStatusService() {
        return statusService;
    }

    public void setStatusService(String statusService) {
        this.statusService = statusService;
    }

    public TypeRent getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(TypeRent typeRent) {
        this.typeRent = typeRent;
    }

    public TypeService getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }
}
