package com.vanny96;

import java.util.Collection;

public class Barn {
  private BulkTank bulkTank;
  private MilkingRobot milkingRobot;

  public Barn(BulkTank bulkTank){
    this.bulkTank = bulkTank;
    this.milkingRobot = null;
  }

  public BulkTank getBulkTank(){
    return this.bulkTank;
  }

  public void installMilkingRobot(MilkingRobot milkingRobot){
    this.milkingRobot = milkingRobot;
    this.milkingRobot.setBulkTank(this.bulkTank);
  }

  public void takeCareOf(Cow cow){
    try {
      milkingRobot.milk(cow);

    } catch (Exception e) {
      throw new IllegalStateException("MilkRobot has to be installed");
    }
  }

  public void takeCareOf(Collection<Cow> cows){
    try {
      for(Cow cow : cows){
        milkingRobot.milk(cow);
      }
    } catch (Exception e) {
      throw new IllegalStateException("MilkRobot has to be installed");
    }
  }

  @Override
  public String toString() {
    return bulkTank.toString();
  }
}