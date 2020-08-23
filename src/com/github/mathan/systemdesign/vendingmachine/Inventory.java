package com.github.mathan.systemdesign.vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {

    private Map<T,Integer> inventory = new HashMap<>();

    public int getQuantity(T item){
        Integer value=inventory.get(item);
        return value==null ?0:value;

    }

    public void add(T item){
        int count=inventory.get(item);
        inventory.put(item,count+1);
    }

    public void  deduct(T item){
        if(hasItem(item)){
            int count = inventory.get(item);
            inventory.put(item,count-1);
        }
    }

    public void clear(){
        inventory.clear();
    }

    public boolean hasItem(T item) {
        return getQuantity(item)>0;
    }

    public void Put(T t,Integer quantity){
        inventory.put(t,quantity);
    }

}
