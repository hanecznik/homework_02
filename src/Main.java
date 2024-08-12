public class Main {
    public static void main(String[] args) {

        Mammal mammal = new Mammal("Dog", true);
        Bird bird = new Bird("Eagle", true);
        Reptile reptile = new Reptile("Snake", true);
        Fish fish = new Fish("Salmon", "Freshwater");

        System.out.println(mammal.getInfo());
        System.out.println(bird.getInfo());
        System.out.println(reptile.getInfo());
        System.out.println(fish.getInfo());
    }
}