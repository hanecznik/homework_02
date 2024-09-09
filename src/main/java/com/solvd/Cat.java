package com.solvd;

public class Cat extends Mammal implements ILandAnimal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking gracefully.");
    }
}
