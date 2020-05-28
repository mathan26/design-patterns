package com.github.mathan.design_patterns.abstract_factory_pattern;

public class UFOBossEnemyShip extends EnemyShip {
    EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory shipPartsFactory) {
        this.shipFactory=shipPartsFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship "+getName());
        weapon=shipFactory.addESGun();
        engine=shipFactory.addESEngine();
    }
}
