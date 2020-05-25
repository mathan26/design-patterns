package com.github.mathan.design_patterns.factory_pattern;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy=null;
        Scanner input = new Scanner(System.in);
        System.out.println("What type ship?(U / R / B)");

        if(input.hasNextLine()){
            String typeOfEnemy =input.next();
            theEnemy=shipFactory.makeEnemyShip(typeOfEnemy);
        }
        doStuffwithEnemy(theEnemy);

    }

    private static void doStuffwithEnemy(EnemyShip theEnemy) {
        theEnemy.displayEnemyShip();
        theEnemy.followHeroShip();
        theEnemy.enmeyShipShoots();
    }
}
