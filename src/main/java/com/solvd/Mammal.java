package com.solvd;

public abstract class Mammal implements IAnimal {
    protected String name;

    public Mammal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    public abstract void makeSound();
}
