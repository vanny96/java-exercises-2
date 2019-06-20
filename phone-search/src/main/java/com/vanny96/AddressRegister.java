package com.vanny96;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressRegister {
  private Map<String, String[]> addressRegister;
  Scanner reader;



  public AddressRegister(Scanner reader){
    this.addressRegister = new HashMap<String, String[]>();
    this.reader = reader;
  }

  public void addAddress(){
    System.out.print("whose address: ");
    String name = reader.nextLine();

    System.out.print("Street: ");
    String street = reader.nextLine();

    System.out.print("City: ");
    String city = reader.nextLine();

    if(!addressRegister.containsKey(name)){
      addressRegister.put(name, new String[2]);
    } 
    
    String[] address = addressRegister.get(name);
    address[0] = street;
    address[1] = city;
  }

  public void searchAddressnByName(){
    System.out.print("Whose information: ");
    String name = reader.nextLine();
    
    searchAddressnByName(name);
  }

  public void searchAddressnByName(String name){
    boolean found = false;

    for(String addressName : addressRegister.keySet()){
      if(addressName.equals(name)){
        System.out.println("address: " + addressRegister.get(name)[0] + " " + addressRegister.get(name)[1]);
        
        found = true;
      }
    }

    if(!found){
      System.out.println("address unkown");
    }
  }

  public void removeByName(String name){
    addressRegister.remove(name);
  }

  public List<String> filteredSearch(String keyWord){
    List<String> names = new ArrayList<String>();

    for(String name : this.addressRegister.keySet()){
      if(name.contains(keyWord) || 
         this.addressRegister.get(name)[0].contains(keyWord) ||
         this.addressRegister.get(name)[1].contains(keyWord)){

          names.add(name);
         }
    }

    return names;
  }
}