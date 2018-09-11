package com.szxs.service;

import com.szxs.entity.Car_Info;
import com.szxs.entity.Pager;
import org.apache.ibatis.annotations.Param;

public interface Car_InfoService {

    Pager<Car_Info> queryCarInfo(int pageNo, int pageSize, Integer keyType, String val);

    /**
     * 增加
     * @param car_info
     * @return
     */
    int addCarInfo(Car_Info car_info);
}
