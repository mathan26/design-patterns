package com.github.mathan.design_patterns.abstract_factory_pattern;

public abstract class EnemyShip {
    public String name;

    ESWeapon weapon;
    ESEngine engine;

    abstract  void makeShip();

    public void followHerShip(){
        System.out.println(getName()+ "is following here at "+engine);
    }

    public void displayEnemyShip(){
        System.out.println(getName()+" is on the screen");
    }
    public void enemyShipShoots(){
        System.out.println(getName()+ "attacks and does "+weapon );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String toString(){
        String infoShip = " The "+name+ " has a top speed of "+engine+ " and an attack power of "+weapon;
        return infoShip;
    }
}
