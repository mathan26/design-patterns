package com.github.mathan.design_patterns.oops;

public class Cat extends Animal {
    public Cat(){
        super();
        setSound("Meow");
    }

    @Override
    public void getLifeTime() {
        System.out.println("2-16 years");
    }
}
