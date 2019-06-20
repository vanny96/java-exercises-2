package com.vanny96;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Farm implements Alive{
  private String owner;
  private Barn barn;
  private List<Cow> cows;

  public Farm(String owner, Barn barn){
    this.owner = owner;
    this.barn = barn;
    this.cows = new ArrayList<Cow>();
  }

  public void installMilkingRobot(MilkingRobot robot){
    this.barn.installMilkingRobot(robot);
  }

  public void addCow(Cow cow){
    cows.add(cow);
  }

  @Override
  public void liveHour() {
    for(Cow cow : cows){
      cow.liveHour();
    }
  }

  public void manageCows(){
    barn.takeCareOf(cows);
  }
  
  @Override
  public String toString() {
    String string = "Farm owner: " + this.owner;
    string += "\nBarn bulk tank: " + barn.getBulkTank().toString();
    string += "\nAnimals: ";

    for(Cow cow : cows){
      string += "\n        " + cow.toString();
    }

    return string;
  }
}