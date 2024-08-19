public class Bird extends Animal {
    protected boolean canFly;

    protected Bird(String species, Food food, boolean canFly) {
        super(species, food);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String getInfo() {
        return "Species: " + species + ", " + food.getFoodInfo() + ", Can Fly: " + canFly;
    }

    @Override
    public String toString() {
        return "Bird [species=" + species + ", food=" + food.getFoodInfo() + ", canFly=" + canFly + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Boolean.hashCode(canFly);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Bird bird = (Bird) obj;
        return canFly == bird.canFly;
    }
}
