package com.szxs.dao;

import com.szxs.entity.Car_Info;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Car_InfoDao {

    /**
     * 查询当前页数据
     * @param offset
     * @param pageSize
     * @param keyType
     * @param val
     * @return
     */
    List<Car_Info> queryCarInfo(@Param("offset") int offset,
                                @Param("pageSize")int pageSize,
                                @Param("keyType")Integer keyType,
                                @Param("val")String val);

    /**
     * 查询总行数
     * @param keyType
     * @param val
     * @return
     */
    int queryCarInfoRows(@Param("keyType")Integer keyType,
                         @Param("val")String val);

    /**
     * 增加
     * @param car_info
     * @return
     */
    int addCarInfo(Car_Info car_info);
}
