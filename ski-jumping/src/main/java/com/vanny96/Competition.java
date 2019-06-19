package com.vanny96;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Competition{
  private ArrayList<Jumper> jumpers;
  private Scanner reader;

  public Competition(Scanner reader){
    jumpers = new ArrayList<Jumper>();
    this.reader = reader;
  }


  public void play(){
    String play;
    int round = 0;

    System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");

    while((play = reader.nextLine()).equals("jump")){
      round++;
      System.out.println("\nRound: " + round);

      System.out.println("\nJumping order:");
      printJumpers();

      playRound(round);

      System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
    }

    System.out.println("\n Thanks! \n");
    printResults();
  }

  private void playRound(int round){
    System.out.println("\nResults of round " + round);

    Random random = new Random();
    int lenght;
    int[] votes = new int[5];

    for(Jumper jumper : jumpers){
      System.out.println(jumper.name());

      lenght = random.nextInt(60) + 60;
      System.out.println("Lenght: " + lenght);

      for(int i=0; i<5; i++){
        votes[i] = random.nextInt(10) + 10;
      }
      printVotes(votes);      

      jumper.addPoints(lenght, votes);
    }
  }

  public void printResults(){
    System.out.println("Tournament results:");
    System.out.println("Postition  Name");

    Collections.sort(jumpers);

    for(int i = 0; i < jumpers.size(); i++){
      System.out.println((i+1) + "          " + jumpers.get(i).name());
      System.out.print("            ");
      jumpers.get(i).printLenghts();
    }
  }


  public void add(Jumper jumper){
    jumpers.add(jumper);
  }


  public void addJumpers(){
    System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

    String name;
    System.out.print("Partecipant name: ");

    while(!(name = reader.nextLine()).equals("")){
      System.out.print("Partecipant name: ");
      this.add(new Jumper(name));
    }
  }


  public void printJumpers(){
    int i = 1;
    for(Jumper jumper : jumpers){
      System.out.println(i + ". " + jumper);
      i++;
    }
  }

  private void printVotes(int[] votes){
    System.out.print("judge votes: [");

    for(int i = 0; i<votes.length; i++){
      System.out.print(votes[i]);

      if(i < votes.length - 1){
        System.out.print(",");
      }
    }
    System.out.println("]");
  }
}