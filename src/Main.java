public class Main {
    public static void main(String[] args) {

        Food dogFood = new Food("Dog Food", 400);
        Food birdFood = new Food("Seeds", 150);
        Food snakeFood = new Food("Mice", 250);
        Food fishFood = new Food("Algae", 50);

        Mammal mammal = new Mammal("Dog", dogFood, true);
        Bird bird = new Bird("Eagle", birdFood, true);
        Reptile reptile = new Reptile("Snake", snakeFood, true);
        Fish fish = new Fish("Salmon", fishFood, "Freshwater");

        System.out.println(mammal.getInfo());
        System.out.println(bird.getInfo());
        System.out.println(reptile.getInfo());
        System.out.println(fish.getInfo());
    }
}