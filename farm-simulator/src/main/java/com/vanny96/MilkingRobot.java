package com.vanny96;

public class MilkingRobot{
  private BulkTank tank;

  public MilkingRobot(){
    this.tank = null;
  }

  public void setBulkTank(BulkTank tank){
    this.tank = tank;
  }

  public BulkTank getBulkTank(){
    return this.tank;
  }

  public void milk(Milkable milkable){
    try{
      this.tank.addToTank(milkable.milk());
    } catch (Exception e) {
      throw new IllegalStateException("The MilkRobot hasn't been installed");
    }
  }
}