package com.github.mathan.design_patterns.oops;

public abstract class Animal {
    private String name;
    private int weight;
    private String sound;

    public abstract void getLifeTime();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight>0){
            this.weight = weight;
        }else{
            System.err.println("Not a valid weight!");
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
