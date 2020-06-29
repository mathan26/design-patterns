package com.github.mathan.ObjectOrientedThinking.inheritance;

public class Client {
    public static void main(String[] args) {
        Animal catanimal = new Cat();
        Animal birdAnimal = new Bird();

        catanimal.isFly();
        birdAnimal.isFly();
    }
}
