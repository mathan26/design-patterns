package com.github.mathan.systemdesign.vendingmachine;

public enum Coin {
    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);

    private int denomination;
    Coin(int value){
        this.denomination=value;
    }

    public int getDenomination() {
        return denomination;
    }
}
