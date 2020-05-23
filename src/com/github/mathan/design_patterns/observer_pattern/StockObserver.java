package com.github.mathan.design_patterns.observer_pattern;

public class StockObserver implements Observer {
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int ObserverIDTracker=0;
    private int observerID;
    private Subject stockGrapper;

    public StockObserver(Subject stockGrapper) {
        this.stockGrapper = stockGrapper;
        this.observerID=++ObserverIDTracker;
        System.out.println("New Observer"+this.observerID);
        stockGrapper.register(this);
    }

    @Override
    public void update(double ibmprice, double aaplprice, double googprice) {
        this.ibmPrice=ibmprice;
        this.aaplPrice=aaplprice;
        this.googPrice=googprice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");

    }
}
