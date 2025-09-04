package com.jayslog.springtest.mybatis.service;

import com.jayslog.springtest.mybatis.entity.RealEstate;
import com.jayslog.springtest.mybatis.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealEstateService {

    @Autowired
    private RealEstateRepository realEstateRepository;

    public RealEstate getRealEstateId(int id) {
        RealEstate realEstate = realEstateRepository.selectRealEstateId(id);
        return realEstate;
    }

    public List<RealEstate> getRealEstateRent(int rentPrice) {
        List<RealEstate> realEstateList = realEstateRepository.selectRealEstateRent(rentPrice);
        return realEstateList;
    }

    public List<RealEstate> getRealEstateListByAreaAndPrice(int area, int price) {
        List<RealEstate> realEstateList = realEstateRepository.selectRealEstateListByAreaAndPrice(area, price);
        return realEstateList;
    }

    public int insertRealEstateByObject(RealEstate realEstate) {
        int count = realEstateRepository.insertRealEstateByObject(realEstate);
        return count;
    }

    public int insertRealEstateByParameter(
            int realtorId
            , String address
            , int area
            , String type
            , int price
            , int rentPrice
    ) {
        int count = realEstateRepository.insertRealEstateByParameter(realtorId, address, area, type, price, rentPrice);
        return count;
    }

    public int updateRealEstate(int id, String type, int price) {

        int count = realEstateRepository.updateRealEstate(id, type, price);
        return count;
    }
}
