package com.szxs.entity;


import java.util.Date;

/**
 * 汽车信息
 */
public class Car_Info {

  private long car_Id;
  private String car_Type;
  private double capacity;
  private String manufacturer;
  private Date produce_Date;
  private double price;

  private Car_Resever resever;//汽车状态


  public long getCar_Id() {
    return car_Id;
  }

  public void setCar_Id(long car_Id) {
    this.car_Id = car_Id;
  }


  public String getCar_Type() {
    return car_Type;
  }

  public void setCar_Type(String car_Type) {
    this.car_Type = car_Type;
  }


  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }


  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public Date getProduce_Date() {
    return produce_Date;
  }

  public void setProduce_Date(Date produce_Date) {
    this.produce_Date = produce_Date;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Car_Resever getResever() {
    return resever;
  }

  public void setResever(Car_Resever resever) {
    this.resever = resever;
  }
}
