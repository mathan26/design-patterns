package com.github.mathan.design_patterns.observer_pattern;

public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
