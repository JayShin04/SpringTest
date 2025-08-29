package com.jayslog.springtest.mybatis;

import com.jayslog.springtest.mybatis.entity.RealEstate;
import com.jayslog.springtest.mybatis.service.RealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/mybatis/real-estate")
@Controller
public class RealEstateController {

    @Autowired
    private RealEstateService realEstateService;

    @RequestMapping("select/1")
    @ResponseBody
    public RealEstate realEstateId(@RequestParam("id") int id) {
        RealEstate realEstate = realEstateService.getRealEstateId(id);
        return realEstate;
    }

    @RequestMapping("select/2")
    @ResponseBody
    public List<RealEstate> realEstateRent(@RequestParam("rent") int rentPrice) {
        List<RealEstate> realEstateList = realEstateService.getRealEstateRent(rentPrice);
        return realEstateList;
    }

    @RequestMapping("select/3")
    @ResponseBody
    public List<RealEstate> realEstateListByAreaAndPrice(
            @RequestParam("area") int area
            , @RequestParam("price") int price
    ) {
        List<RealEstate> realEstateList = realEstateService.getRealEstateListByAreaAndPrice(area, price);
        return realEstateList;
    }
}
