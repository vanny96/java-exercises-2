package com.vanny96;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageSensor implements Sensor{
  private ArrayList<Sensor> sensors;
  private List<Integer> readings;

  public AverageSensor(){
    this.sensors = new ArrayList<Sensor>(); 
    this.readings = new ArrayList<Integer>();
  }

  @Override
  public boolean isOn() {
    for(Sensor sensor : sensors){
      if(!sensor.isOn()){
        return false;
      }
    }

    return true;
  }

  @Override
  public void on() {
    for(Sensor sensor : sensors){
      sensor.on();
    }
  }

  @Override
  public void off() {
    sensors.get(0).off();
  }

  @Override
  public int measure() {
    if(!isOn() || sensors.isEmpty()){
      throw new IllegalStateException();
    }

    int sum = 0;
    int number = 0;

    for(Sensor sensor : sensors){
      sum += sensor.measure();
      number++;
    }

    readings.add(sum/number);
    return sum/number;
  }

  public String readings(){
    int[] readings = new int[this.readings.size()];

    for(int i = 0; i < readings.length; i++){
      readings[i] = this.readings.get(i);
    }
    
    return Arrays.toString(readings);
  }

  public void addSensor(Sensor sensor){
    this.sensors.add(sensor);
  }
  
}