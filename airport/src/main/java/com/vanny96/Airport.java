package com.vanny96;

import java.util.ArrayList;
import java.util.Scanner;

public class Airport{
  private ArrayList<Plane> planes; 
  private ArrayList<Flight> flights;
  private Scanner reader;

  public Airport(Scanner reader){
    planes = new ArrayList<Plane>();
    flights = new ArrayList<Flight>();

    this.reader = reader;
  }

  // Airport panel functions

  public void addPlane(){
    System.out.print("Give plane ID: ");
    String planeID = reader.nextLine();

    System.out.print("Give plane capacity: ");
    int planeCapacity = Integer.parseInt(reader.nextLine());

    planes.add(new Plane(planeID, planeCapacity));
  }

  public void addFlight(){
    System.out.print("Give plane ID: ");
    String planeID = reader.nextLine();

    System.out.print("Give departure airport code: ");
    String departureID = reader.nextLine();

    System.out.print("Give destination airport code: ");
    String destinationID = reader.nextLine();

    Plane plane = findPlane(planeID);
    if(plane == null){
      System.out.println("Plane does not exist");
      return;
    }

    flights.add(new Flight(plane, departureID, destinationID));
  }

  // Flight Service functions

  public void printPlane(){
    System.out.print("Give plane id: ");
    String planeID = reader.nextLine();

    Plane plane = findPlane(planeID);
    if(plane == null){
      System.out.println("Plane not found");
      return;
    } else {
      System.out.println(plane);
    }
  }

  public void printPlanes(){
    for(Plane plane:planes){
      System.out.println(plane);
    }
  }

  public void printFlights(){
    for(Flight flight:flights){
      System.out.println(flight);
    }
  }

  // Utility function

  public Plane findPlane(String name){
    for(Plane plane:planes){
      if (plane.getPlaneID().equals(name)){
        return plane;
      }
    }

    return null;
  }

}