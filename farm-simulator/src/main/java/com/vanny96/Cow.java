package com.vanny96;

import java.util.Random;

public class Cow implements Alive, Milkable{

  private final String[] NAMES = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

  private String name;
  private double udderCapacity;
  private double amount;

  Random random = new Random();



  public Cow(){

    int index = random.nextInt(this.NAMES.length) -1;
    this.name = NAMES[index];
    this.udderCapacity = random.nextInt(25) + 15;
    this.amount = 0;
  }

  public Cow(String name){
    this();
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public double getCapacity(){
    return Math.ceil(this.udderCapacity * 10) / 10;
  }

  public double getAmount(){
    return Math.ceil(this.amount * 10) / 10;
  }

  @Override
  public String toString() {
    return this.name + " " + getAmount() + "/" + Math.ceil(getCapacity());
  }

  @Override
  public double milk() {
    double milk = this.amount;
    this.amount = 0;
    return milk;
  }

  @Override
  public void liveHour() {
    this.amount += random.nextDouble()*1.30 + 0.70;

    if(this.amount > this.udderCapacity){
      this.amount = this.udderCapacity;
    }
  }
  
}