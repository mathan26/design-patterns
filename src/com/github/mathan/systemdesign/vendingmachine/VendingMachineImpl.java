package com.github.mathan.systemdesign.vendingmachine;

import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    private Inventory<Coin> cashInventory = new Inventory<>();
    private Inventory<Item> itemInventory=new Inventory<>();
    private long totalSales;
    private Item currentItem;
    private long currentBalance;


    public VendingMachineImpl() {
        Initialize();
    }

    private void Initialize() {
        for(Coin c:Coin.values()){
            cashInventory.Put(c,5);
        }
        for(Item c:Item.values()){
            itemInventory.Put(c,5);
        }
    }

    @Override
    public long selectItemAndPrice(Item item) {
        return 0;
    }

    @Override
    public void insertCoin(Coin coin) {

    }

    @Override
    public List<Coin> refund() {
        return null;
    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange() {
        return null;
    }

    @Override
    public void reset() {

    }
}
