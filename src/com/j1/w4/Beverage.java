package com.j1.w4;

public abstract class Beverage {
  String description = "Unkown beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}