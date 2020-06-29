package com.github.mathan.ObjectOrientedThinking.inheritance;

public abstract class Animal {
    public void eat() {
        System.out.println("This animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public abstract void isFly();
}
