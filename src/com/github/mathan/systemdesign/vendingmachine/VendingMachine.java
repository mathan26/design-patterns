package com.github.mathan.systemdesign.vendingmachine;

import java.util.List;

public interface VendingMachine {

    public long selectItemAndPrice(Item item);
    public void insertCoin(Coin  coin);
    public List<Coin> refund();
    public Bucket<Item,List<Coin>> collectItemAndChange();
    public void reset();

}
