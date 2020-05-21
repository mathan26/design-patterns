package com.github.mathan.design_patterns.strategy_pattern;

import com.github.mathan.design_patterns.oops.Flys;

public class CantFly implements Flys {

    @Override
    public String fly() {
        return "Can't fly";
    }
}
