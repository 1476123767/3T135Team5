package com.szxs.controller;

import com.mysql.jdbc.Driver;
import com.szxs.entity.Car_Info;
import com.szxs.entity.Pager;
import com.szxs.service.Car_InfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class Car_InfoController {
    @Resource
    private Car_InfoService car_infoService;

    @RequestMapping("/showInfos")
    public String showInfos(@RequestParam(required = false,defaultValue = "1") Integer pageNo,
                            @RequestParam(required = false,defaultValue = "0")Integer keyType,
                            String val, Model model){

        Pager<Car_Info> pager = car_infoService.queryCarInfo(pageNo, 5, keyType, val);
        model.addAttribute("pager",pager);
        return "index";
    }

    @RequestMapping("/addInfos")
    public String addCarInfo(HttpSession session, HttpServletRequest req, HttpServletResponse resp){
        car_infoService.addCarInfo(null);
        return "index";
    }

    //局部异常
    @ExceptionHandler(value={RuntimeException.class})
    public String handlerException(RuntimeException e,HttpServletRequest req){
        req.setAttribute("e", e);
        return "error";
    }

}
