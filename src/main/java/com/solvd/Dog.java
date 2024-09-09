package com.solvd;

public class Dog extends Mammal implements ILandAnimal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking on four legs.");
    }
}
