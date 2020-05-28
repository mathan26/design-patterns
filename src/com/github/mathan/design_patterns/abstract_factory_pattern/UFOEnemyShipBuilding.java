package com.github.mathan.design_patterns.abstract_factory_pattern;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory=new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        }else if(typeOfShip.equals("UFO BOSS")){
            EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
            theEnemyShip=new UFOBossEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO BOSS");
        }
        return theEnemyShip;
    }
}
