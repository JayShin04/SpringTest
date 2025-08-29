package com.jayslog.springtest.database;


import com.jayslog.springtest.database.entity.Store;
import com.jayslog.springtest.database.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StoreController {

    // Controller의 역할은
    // url 매핑.
    // Request, Response

    @Autowired
    private StoreService storeService;


    // Response로 객체 정보들을 얻어와서 리턴해주는 것이기에
    @RequestMapping("/db/store/list")
    @ResponseBody
    public List<Store> storeList() {
        // 여기에서 store 정보 값 얻어오기
        List<Store> storeList = storeService.getStoreList();
        return storeList;
    }
}
