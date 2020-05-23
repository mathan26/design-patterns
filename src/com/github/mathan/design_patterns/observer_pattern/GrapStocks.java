package com.github.mathan.design_patterns.observer_pattern;

public class GrapStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        stockGrabber.setIbmprice(197.00);
        stockGrabber.setAaplprice(677.60);
        stockGrabber.setGoogprice(676.44);


        StockObserver observer2 = new StockObserver(stockGrabber);


    }
}
