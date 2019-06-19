package com.vanny96;

import java.util.HashMap;

public class VehicleRegister{
  HashMap<RegistrationPlate, String> vehicles;

  public VehicleRegister(){
    vehicles = new HashMap<RegistrationPlate, String>();
  }

  public boolean add(RegistrationPlate plate, String owner){
    if(vehicles.get(plate) == null){
      vehicles.put(plate, owner);
      return true;

    } else {
      return false;
    }
  }

  public boolean delete(RegistrationPlate plate){
    if(vehicles.get(plate) == null){
      return false;
    } else {
      vehicles.remove(plate);
      return true;
    }
  }

  public String get(RegistrationPlate plate){
    if(vehicles.get(plate) == null){
      return null;
    } else {
      return vehicles.get(plate);
    }
  }

  public void printVehicles(){
    for(RegistrationPlate plate : vehicles.keySet()){
      System.out.println(plate + " Owned by " + vehicles.get(plate));
    }
  }

  public void printRegistrationPlate(){
    for(RegistrationPlate plate : vehicles.keySet()){
      System.out.println(plate);
    }
  }

  public void printOwners(){
    for(String owner : vehicles.values()){
      System.out.println(owner);
    }
  }
}