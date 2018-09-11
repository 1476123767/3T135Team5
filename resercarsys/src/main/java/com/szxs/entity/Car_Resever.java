package com.szxs.entity;


/**
 * 汽车状态
 */
public class Car_Resever {

  private long resever_Id;
  private long car_Id;
  private String status;


  public long getResever_Id() {
    return resever_Id;
  }

  public void setResever_Id(long resever_Id) {
    this.resever_Id = resever_Id;
  }


  public long getCar_Id() {
    return car_Id;
  }

  public void setCar_Id(long car_Id) {
    this.car_Id = car_Id;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
