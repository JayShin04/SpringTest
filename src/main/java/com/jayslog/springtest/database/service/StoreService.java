package com.jayslog.springtest.database.service;


import com.jayslog.springtest.database.entity.Store;
import com.jayslog.springtest.database.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Service의 역할은 부가적인 기능을 수행할 때 사용한다.
public class StoreService {
    // store 리스트의 정보를 얻어오는 기능을 만들자

    // 의존성 주입 - DI(Dependency Injection)
    // 직접 생성하지 않고 스프링에게 맡긴다.
    @Autowired
    private StoreRepository storeRepository;

    public List<Store> getStoreList() {
        // 스프링은 객체를 직접 생성해서 사용하는 것을 지양한다.
        List<Store> storeList = storeRepository.selectStoreList();
        return storeList;
    }
}
