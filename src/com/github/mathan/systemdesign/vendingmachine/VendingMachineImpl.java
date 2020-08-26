package com.github.mathan.systemdesign.vendingmachine;

import java.util.ArrayList;
import java.util.Collections;
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
        if(itemInventory.hasItem(item)) {
            currentItem = item;
            return currentItem.getPrice();
        }else {
            throw new SoldOutException("Sold out, Please by another Item");
        }
    }

    @Override
    public void insertCoin(Coin coin) {
        currentBalance=currentBalance + coin.getDenomination();
        cashInventory.add(coin);
    }

    @Override
    public List<Coin> refund() {
        List<Coin> refund = getChange(currentBalance);
        return refund;
    }

    private List<Coin> getChange(long amount) {
        List<Coin> changes= Collections.emptyList();
        if(amount > 0){
            changes = new ArrayList<>();
            long balance =amount;
            while (balance>0){
                if(balance > Coin.QUARTER.getDenomination() && cashInventory.hasItem(Coin.QUARTER)){
                    changes.add(Coin.QUARTER);
                    balance=balance-Coin.QUARTER.getDenomination();
                    continue;
                }else if(balance >= Coin.DIME.getDenomination() && cashInventory.hasItem(Coin.DIME)) {
                    changes.add(Coin.DIME);
                    balance = balance - Coin.DIME.getDenomination();
                    continue;
                }else if(balance >= Coin.NICKLE.getDenomination() && cashInventory.hasItem(Coin.NICKLE)) {
                    changes.add(Coin.DIME);
                    balance = balance - Coin.NICKLE.getDenomination();
                    continue;
                }else if(balance >= Coin.PENNY.getDenomination() && cashInventory.hasItem(Coin.PENNY)) {
                    changes.add(Coin.DIME);
                    balance = balance - Coin.PENNY.getDenomination();
                    continue;
                }else{
                    throw new NotSufficientChangeException("NotSufficientChange, Please try another product");
                }
            }
        }
        return changes;
    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange() {
        Item item = collectItem();
        totalSales = totalSales + currentItem.getPrice(); 
        List<Coin> change = collectChange(); 
        return new Bucket<Item, List<Coin>>(item, change);

    }

    private List<Coin> collectChange() {
        long changeAmount = currentBalance - currentItem.getPrice();
        List<Coin> change = getChange(changeAmount);
        updateCashInventory(change); 
        currentBalance = 0; currentItem = null; return change;

    }

    private void updateCashInventory(List<Coin> change) {
        for(Coin c : change){
            cashInventory.deduct(c);
        }
    }

    private Item collectItem() {
        if(isFullPaid()){
            if(hasSufficientChange()){
                itemInventory.deduct(currentItem);
                return currentItem;
            }
            throw new NotSufficientChangeException("Not sufficient change in Inventory");
        }
        long remainingBalance = currentItem.getPrice() -  currentBalance;
        throw new NotFullPaidException("price not full paid, remaining :"+remainingBalance);
    }

    private boolean hasSufficientChange() {
        return hasSufficientChangeForAmount(currentBalance - currentItem.getPrice());
    }

    private boolean hasSufficientChangeForAmount(long amount) {
        boolean hasChange  = true;
        try {
            getChange(amount);
        }catch (NotSufficientChangeException e){
            hasChange=false;
        }
        return hasChange;
    }

    private boolean isFullPaid() {
        if(currentBalance >= currentItem.getPrice()){
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        cashInventory.clear();
        itemInventory.clear();
        totalSales = 0;
        currentItem = null;
        currentBalance = 0;

    }
}
