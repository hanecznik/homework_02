abstract class Animal {
    protected String species;
    protected Food food;

    protected Animal(String species, Food food) {
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

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Animal [species=" + species + ", food=" + food.getFoodInfo() + "]";
    }

    @Override
    public int hashCode() {
        return species.hashCode() + food.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return species.equals(animal.species) && food.equals(animal.food);
    }
}