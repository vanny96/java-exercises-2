package com.vanny96;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Jumper implements Comparable<Jumper> {
  private String name;
  private int points;
  private ArrayList<Integer> jumps;

  public Jumper(String name) {
    this.jumps = new ArrayList<Integer>();
    this.points = 0;
    this.name = name;
  }

  @Override
  public int compareTo(Jumper jumper) {
    return this.points - jumper.points;
  }

  public String name() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.name + "(" + this.points + " points)";
  }

  public void addPoints(int lenght, int[] votes) {
    int points = Arrays.stream(votes).sum() + lenght;
    this.points += points;

    this.jumps.add(lenght);
  }

  public void printLenghts(){
    System.out.print("jump lenghts: ");
    for(Integer jump : jumps){
      System.out.print(jump + " meters ");
    }
    System.out.println();
  }
}