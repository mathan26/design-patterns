package com.github.mathan.design_patterns.strategy_pattern;

import com.github.mathan.design_patterns.oops.Animal;
import com.github.mathan.design_patterns.oops.Bird;
import com.github.mathan.design_patterns.oops.Dog;

public class AnimalPlay {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();
        System.out.println("Dog: "+sparky.tryToFly());
        System.out.println("Bird:"+tweety.tryToFly());

        //This allows dynamic changes for flyingType
        sparky.setFlyingAbility(new ItFlys());
        System.out.println("Dog: "+sparky.tryToFly());
    }
}
