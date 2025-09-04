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

    @RequestMapping("insert/1")
    @ResponseBody
    public String realEstateInsertByObject() {
        RealEstate realEstate = new RealEstate();
        realEstate.setRealtorId(3);
        realEstate.setAddress("푸르지용 리버 303동 1104호");
        realEstate.setArea(89);
        realEstate.setType("매매");
        realEstate.setPrice(100000);
//        int count = realEstateService.insertRealEstateByObject(realEstate);
//        return "실행 결과 : " + count;
        int count = 0;
        return "입력 성공 : " + count;
    }


    @RequestMapping("insert/2")
    @ResponseBody
    public String realEstateInsertByParameter(@RequestParam("realtorId") int realtorId) {
        int count = realEstateService.insertRealEstateByParameter(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
        return "입력 성공 : " + count;
    }


    @RequestMapping("update/1")
    @ResponseBody
    public String editRealEstate() {
        // type전세,  price 70000 id가 22
        int count = realEstateService.updateRealEstate(22, "전세", 70000);
        return "입력 성공 : " + count;
    }
}
