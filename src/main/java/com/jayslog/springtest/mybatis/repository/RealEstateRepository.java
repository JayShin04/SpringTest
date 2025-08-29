package com.jayslog.springtest.mybatis.repository;

import com.jayslog.springtest.mybatis.entity.RealEstate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RealEstateRepository {
    public RealEstate selectRealEstateId(@Param("id") int id);
    public List<RealEstate> selectRealEstateRent(@Param("rentPrice") int rentPrice);
    public List<RealEstate> selectRealEstateListByAreaAndPrice(
            @Param("area") int area
            , @Param("price") int price
    );
}
