package com.github.mathan.design_patterns.factory_pattern;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String enemyShip){
        if (enemyShip.equals("U")) {
            return new UFOEnemyShip();
        }else if(enemyShip.equals("B")){
            return new BigUFOEnemyShip();
        }else if (enemyShip.equals("R")){
            return new RocketEnemyShip();
        }else {
            return null;
        }
    }
}
