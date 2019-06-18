package com.vanny96;

public class Plane{
  private String planeID;
  private int planeCapacity;

  public Plane(String planeID, int planeCapacity){
    this.planeID = planeID;
    this.planeCapacity = planeCapacity;
  }

  public String toString(){
    return planeID + "(" + planeCapacity + " people)";
  }

  public String getPlaneID(){
    return this.planeID;
  }
}