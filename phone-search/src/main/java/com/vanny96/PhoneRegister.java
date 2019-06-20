package com.vanny96;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneRegister {
  private Map<String, List<String>> phoneRegister; 
  Scanner reader;

  public PhoneRegister(Scanner reader){
    this.phoneRegister = new HashMap<String, List<String>>();
    this.reader = reader;
  }

  public void add(){
    System.out.print("whose number: ");
    String name = reader.nextLine();

    System.out.print("number: ");
    String phoneNumber = reader.nextLine();

    if(!this.phoneRegister.keySet().contains(name)){
      this.phoneRegister.put(name, new ArrayList<String>());
    }

    this.phoneRegister.get(name).add(phoneNumber);
  }

  public void searchByName(){
    System.out.print("whose number: ");
    String name = reader.nextLine();

    searchByName(name);
  }

  public void searchByName(String name){
    for(String phoneName : phoneRegister.keySet()){
      if(phoneName.equals(name)){
        System.out.println("phone numbers: ");

        for(String phoneNumber : phoneRegister.get(phoneName)){
          System.out.println(phoneNumber);
        }

        return;
      }
    }

    System.out.println("Phone number not found");
    return;
  }

  public void searchByNumber(){
    System.out.print("Number: ");
    String number = reader.nextLine();
    
    searchByNumber(number);
  }

  public void searchByNumber(String number){
    for(String phoneName : phoneRegister.keySet()){
      if(phoneRegister.get(phoneName).contains(number)){
        System.out.println(phoneName);
        return;
      }
    }

    System.out.println("Not found");
    return;
  }

  public void removeByName(String name){
    phoneRegister.remove(name);
  }

  public List<String> filteredSearch(String keyWord){
    List<String> names = new ArrayList<String>();

    for(String name : this.phoneRegister.keySet()){
      if(name.contains(keyWord)){

          names.add(name);
         }
    }

    return names;
  }
}