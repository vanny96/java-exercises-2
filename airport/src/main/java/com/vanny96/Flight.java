package com.vanny96;

public class Flight{
  private Plane plane;
  private String departureID;
  private String destinationID;

  public Flight(Plane plane, String departureID, String destinationID){
    this.plane = plane;
    this.departureID = departureID;
    this.destinationID = destinationID;
  }

  public String toString(){
    return plane.toString() + " (" + departureID + "-" + destinationID + ")";
  }
}