package com.github.mathan.design_patterns.abstract_factory_pattern;

public class UFOEnemyShip extends EnemyShip {
    EnemyShipFactory shipFactory;
    public UFOEnemyShip(EnemyShipFactory shipPartsFactory) {
        this.shipFactory = shipPartsFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship "+getName());
        weapon=shipFactory.addESGun();
        engine=shipFactory.addESEngine();
    }
}
