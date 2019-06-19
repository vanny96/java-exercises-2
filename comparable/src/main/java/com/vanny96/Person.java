package com.vanny96;

public class Person implements Comparable<Person>{
  private String name;
  private int salary;

  public Person(String name, int salary){
    this.name = name;
    this.salary = salary;
  }

  @Override
  public int compareTo(Person person){
    return this.salary - person.salary;
  }

  @Override
  public String toString() {
    return this.name + " salary: " + this.salary;
  }
}