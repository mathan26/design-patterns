package com.github.mathan.design_patterns.oops;

import com.github.mathan.design_patterns.strategy_pattern.ItFlys;

public class Bird extends Animal {
    @Override
    public void getLifeTime() {
        System.out.println("Bird Life Time 3 to 5 years");
    }
    public Bird(){
        setSound("Tweet");
        flyingType=new ItFlys();
    }
}
