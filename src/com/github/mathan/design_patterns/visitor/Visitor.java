package com.github.mathan.design_patterns.visitor;

public interface Visitor {
    public double visit(Liquor liquorItem);

    public double visit(Tobacco tobaccoItem);

    public double visit(Necessity necessityItem);
}
