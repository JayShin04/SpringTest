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
    public int insertRealEstateByObject(RealEstate realEstate);
    public int insertRealEstateByParameter(
            @Param("realtorId") int realtorId
            , @Param("address") String address
            , @Param("area") int area
            , @Param("type") String type
            , @Param("price") int price
            , @Param("rentPrice") int rentPrice
    );

    public int updateRealEstate(
            @Param("id") int id
            , @Param("type") String type
            , @Param("price") int price
    );

    public int deleteRealEstate(@Param("id") int id);
}
