package com.jayslog.springtest.database.repository;


import com.jayslog.springtest.database.entity.Store;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//Mapper 역할 :서비스에서 Store 테이블 모든 행 조회
@Mapper
public interface StoreRepository {
    // 모든 행 조회
    public List<Store> selectStoreList();
}
