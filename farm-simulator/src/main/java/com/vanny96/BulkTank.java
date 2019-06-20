package com.vanny96;

public class BulkTank{
  private double capacity;
  private double volume;

  public BulkTank(){
    this(2000);
  }

  public BulkTank(double capacity){
    this.capacity = capacity;
    this.volume = 0.00;
  }

  public double getCapacity(){
    return Math.ceil(this.capacity * 10) / 10;
  }

  public double getVolume(){
    return Math.ceil(this.volume * 10) / 10;
  }

  public double howMuchFreeSpace(){
    return this.capacity - this.volume;
  }

  public void addToTank(double volume){
    this.volume += volume;

    if(this.volume > this.capacity){
      this.volume = this.capacity;
    }
  }

  public void getFromTank(double volume){
    this.volume -= volume;

    if(this.volume < 0){
      this.volume = 0;
    }
  }

  @Override
  public String toString() {
    return getVolume() + "/" + getCapacity();
  }
}