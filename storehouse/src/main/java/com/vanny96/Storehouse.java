package com.vanny96;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse{
  private Map<String, Integer> productsPrices;
  private Map<String, Integer> productsStocks;

  public Storehouse(){
    productsPrices  = new HashMap<String, Integer>();
    productsStocks  = new HashMap<String, Integer>();
  }

  public void addProduct(String product, int price, int stock){
    productsPrices.put(product, price);
    productsStocks.put(product, stock);
  }

  public int price(String product){
    if(productsPrices.get(product) == null){
      return -99;
    } else {
      return productsPrices.get(product);
    }
  }

  public int stock(String product){
    if(productsStocks.get(product) == null){
      return 0;
    } else {
      return productsStocks.get(product);
    }
  }

  public boolean take(String product){
    if(productsStocks.get(product) == null || productsStocks.get(product) == 0){
      return false;
    } else {
      productsStocks.replace(product, (productsStocks.get(product) - 1));
      return true;
    }
  }

  public Set<String> products(){
    Set<String> products = productsStocks.keySet();

    return products;
  }

  
}