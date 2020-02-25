package com.codegym.cms.quanlykhachhang.service;

import com.codegym.cms.quanlykhachhang.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);

}
