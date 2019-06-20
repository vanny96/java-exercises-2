package com.vanny96;

import java.util.Random;

public class Thermometer implements Sensor{
  private int temperature;
  private boolean isOn;

  public Thermometer(){
    isOn = false;
  }

  @Override
  public boolean isOn() {
    return this.isOn;
  }

  @Override
  public void on() {
    this.isOn = true;
  }

  @Override
  public void off() {
    this.isOn = false;
  }

  @Override
  public int measure() {
    Random random = new Random();
    if(isOn()){
      return random.nextInt(60) - 30;
    } else {
      throw new IllegalStateException("Thermometer is off");
    }
  }
  
}