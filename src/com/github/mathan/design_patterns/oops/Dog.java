package com.github.mathan.design_patterns.oops;

public class Dog extends Animal {
    public void digHole(){
        System.out.println("Dug a hole");
    }

    public  Dog(){
        super();
        setSound("Bark");
    }
    public  void changeValue(int someNumber){
        someNumber=15;
        System.out.println("In method call value change: "+someNumber);
    }

    private  void bePrivate(){
        System.out.println("This is a private method of Dog class");
    }

    public void callPrivateMethod(){
        bePrivate();
    }

    @Override
    public void getLifeTime() {
        System.out.println("10-13 years");
    }
}
