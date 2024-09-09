package com.solvd;

public class Dolphin extends Mammal implements ISeaAnimal {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Click!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + "is swimming in the ocean.");
    }
}
