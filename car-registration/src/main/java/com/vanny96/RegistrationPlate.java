package com.vanny96;

public class RegistrationPlate{
  private final String regCode;
  private final String country;

  public RegistrationPlate(String regCode, String country) {
    this.regCode = regCode;
     this.country = country;
  }

  @Override
  public String toString(){
    return country+ " "+regCode;
  }

  @Override
  public boolean equals(Object object){
    if(object == null){
      return false;
    }

    if(getClass() != object.getClass()){
      return false;
    }

    RegistrationPlate plate = (RegistrationPlate) object;

    if(this.regCode.equals(regCode) && this.country.equals(plate.country)){
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode(){
    return this.country.hashCode() + this.regCode.hashCode();
  }
}