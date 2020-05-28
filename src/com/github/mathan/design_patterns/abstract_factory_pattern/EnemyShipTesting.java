package com.github.mathan.design_patterns.abstract_factory_pattern;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();
        EnemyShip theGrunt = makeUFOs.orderShip("UFO");
        System.out.println(theGrunt+"\n");

        EnemyShip theBoss = makeUFOs.orderShip("UFO BOSS");
        System.out.println(theBoss);

    }
}


//CODE OUTPUT
/*
        Making enemy ship UFO Grunt Ship
         UFO Grunt Ship is on the screen
        UFO Grunt Shipis following here at 1000 mph
        UFO Grunt Shipattacks and does 20 damage
        The UFO Grunt Ship has a top speed of 1000 mph and an attack power of 20 damage

        Making enemy ship UFO BOSS
        UFO BOSS is on the screen
        UFO BOSSis following here at 2000 mph
        UFO BOSSattacks and does 40 damage
        The UFO BOSS has a top speed of 2000 mph and an attack power of 40 damage*/
