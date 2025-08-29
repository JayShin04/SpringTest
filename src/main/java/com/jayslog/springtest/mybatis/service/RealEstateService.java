package com.jayslog.springtest.mybatis.service;

import com.jayslog.springtest.mybatis.entity.RealEstate;
import com.jayslog.springtest.mybatis.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealEstateService {

    @Autowired
    private RealEstateRepository realEstateRepositor;

    public RealEstate getRealEstateId(int id) {
        RealEstate realEstate = realEstateRepositor.selectRealEstateId(id);
        return realEstate;
    }

    public List<RealEstate> getRealEstateRent(int rentPrice) {
        List<RealEstate> realEstateList = realEstateRepositor.selectRealEstateRent(rentPrice);
        return realEstateList;
    }

    public List<RealEstate> getRealEstateListByAreaAndPrice(int area, int price) {
        List<RealEstate> realEstateList = realEstateRepositor.selectRealEstateListByAreaAndPrice(area, price);
        return realEstateList;
    }
}
