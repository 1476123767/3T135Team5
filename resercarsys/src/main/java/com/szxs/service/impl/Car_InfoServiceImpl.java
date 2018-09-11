package com.szxs.service.impl;

import com.szxs.dao.Car_InfoDao;
import com.szxs.entity.Car_Info;
import com.szxs.entity.Pager;
import com.szxs.service.Car_InfoService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Car_InfoServiceImpl implements Car_InfoService {
    @Resource
    private Car_InfoDao car_infoDao;

    public Pager<Car_Info> queryCarInfo(int pageNo, int pageSize, Integer keyType, String val) {
        Pager<Car_Info> pager = new Pager<Car_Info>();
        pager.setPageNo(pageNo);
        pager.setPageSize(pageSize);

        pager.setTotalRows(car_infoDao.queryCarInfoRows(keyType,val)); //总行数
        pager.setTotalPage( (pager.getTotalRows()+pageSize-1)/pageSize ); //总页数

        pager.setDatas(car_infoDao.queryCarInfo((pageNo-1)*pageSize,pageSize,keyType,val));//设置当前页数据

        return pager;
    }

    public int addCarInfo(Car_Info car_info) {
        car_infoDao.addCarInfo(car_info);
        if(true){
            //throw new ArithmeticException("随便扔的异常..... 就是不想保存");
        }
        return car_infoDao.addCarInfo(car_info);
    }

}
