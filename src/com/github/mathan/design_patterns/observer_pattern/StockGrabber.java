package com.github.mathan.design_patterns.observer_pattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private double ibmprice;
    private double aaplprice;
    private double googprice;


    private ArrayList<Observer> observers;

    public StockGrabber() {
        observers=new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer "+observerIndex+" deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer o:observers){
            o.update(ibmprice,aaplprice,googprice);
        }
    }

    public void setIbmprice(double ibmprice) {
        this.ibmprice = ibmprice;
        notifyObserver();
    }

    public void setAaplprice(double aaplprice) {
        this.aaplprice = aaplprice;
        notifyObserver();

    }

    public void setGoogprice(double googprice) {
        this.googprice = googprice;
        notifyObserver();

    }
}
