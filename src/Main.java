public class Main {
    public static void main(String[] args) {

        Food dogFood = new Food("Dog Food", 400);
        Food birdFood = new Food("Seeds", 150);
        Food snakeFood = new Food("Mice", 250);
        Food fishFood = new Food("Algae", 50);

        Animal mammal = new Mammal("Dog", dogFood, true);
        Animal bird = new Bird("Eagle", birdFood, true);
        Animal reptile = new Reptile("Snake", snakeFood, true);
        Animal fish = new Fish("Salmon", fishFood, "Freshwater");

        System.out.println(mammal.getInfo());
        System.out.println(bird.getInfo());
        System.out.println(reptile.getInfo());
        System.out.println(fish.getInfo());

        // Testing of methods
        System.out.println("\nTesting toString, hashCode, and equals:");
        System.out.println(mammal);
        System.out.println(bird);
        System.out.println(reptile);
        System.out.println(fish);

        System.out.println("mammal hashCode: " + mammal.hashCode());
        System.out.println("bird hashCode: " + bird.hashCode());
        System.out.println("reptile hashCode: " + reptile.hashCode());
        System.out.println("fish hashCode: " + fish.hashCode());
        System.out.println("mammal equals bird? " + mammal.equals(bird));
        System.out.println("reptile equals fish? " + reptile.equals(fish));

        // Testing of variables & final/static methods
        System.out.println("\nTesting final and static:");
        Constants.printFinalConstant();
        System.out.println(Animal.getAnimalType());
    }
}