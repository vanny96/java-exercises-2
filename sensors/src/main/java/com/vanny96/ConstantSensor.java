package com.vanny96;

public class ConstantSensor implements Sensor{
  private int temperature;
  private boolean isOn;

  public ConstantSensor(int temperature){
    this.temperature = temperature;
    this.isOn = true;
  }

  @Override
  public boolean isOn() {
    if(this.isOn){
      return this.isOn;
    } else {
      throw new IllegalStateException("Sensor can't be off");
    }
  }

  @Override
  public void on() {

  }

  @Override
  public void off() {

  }

  @Override
  public int measure() {
    return temperature;
  }


}