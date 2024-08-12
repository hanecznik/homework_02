public class Animal {
    private String species;
    private Food food;

    public Animal(String species, Food food) {
        this.species = species;
        this.food = food;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String getInfo() {
        return "Species: " + species + ", " + food.getFoodInfo();
    }
}