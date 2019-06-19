package com.vanny96;

public class Purchase{
  private String product;
  private int amount;
  private int price;

  public Purchase(String product, int amount, int price){
    this.product = product;
    this.amount = amount;
    this.price = price;
  }

  public int price(){
    return this.price * this.amount;
  }

  public void increaseAmount(){
    this.amount ++;
  }

  @Override
  public String toString() {
    return product + ": " + amount;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == null){
      return false;
    }

    if(getClass() != obj.getClass()){
      System.out.println("called");
    }

    Purchase purchase = (Purchase) obj;

    if(this.product.equals(purchase.product)){
      return true;
    } else {
      return false;
    }
  }
}