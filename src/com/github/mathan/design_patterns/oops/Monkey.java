package com.github.mathan.design_patterns.oops;

public class Monkey implements Living {
    private  String name;

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
}
