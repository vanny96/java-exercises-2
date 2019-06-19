package com.vanny96;

import java.util.List;
import java.util.ArrayList;

public class ShoppingBasket{
  List<Purchase> purchases;

  public ShoppingBasket(){
    purchases = new ArrayList<Purchase>();
  }

  public void add(String product, int price){
    Purchase purchase = new Purchase(product, 1, price);
    if(!purchases.contains(purchase)){
      purchases.add(purchase);

    } else {
      for(Purchase element : purchases){
        if(element.equals(purchase)){
          element.increaseAmount();
        }
      }
    }
  }

  public int price(){
    int price = 0;
    for (Purchase purchase : purchases){
      price += purchase.price();
    }
    return price;
  }

  public void print(){
    for (Purchase purchase : purchases){
      System.out.println(purchase);
    }
  }
}