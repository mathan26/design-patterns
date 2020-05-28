package com.github.mathan.design_patterns.abstract_factory_pattern;

public abstract class EnemyShipBuilding {
    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderShip(String typeOfShip){
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHerShip();
        theEnemyShip.enemyShipShoots();
        return theEnemyShip;
    }
}
