public class Mammal extends Animal {
    protected boolean isDomesticated;

    protected Mammal(String species, Food food, boolean isDomesticated) {
        super(species, food);
        this.isDomesticated = isDomesticated;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean isDomesticated) {
        this.isDomesticated = isDomesticated;
    }

    @Override
    public String getInfo() {
        return "Species: " + species + ", " + food.getFoodInfo() + ", Domesticated: " + isDomesticated;
    }

    @Override
    public String toString() {
        return "Mammal [species=" + species + ", food=" + food.getFoodInfo() + ", isDomesticated=" + isDomesticated + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Boolean.hashCode(isDomesticated);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Mammal mammal = (Mammal) obj;
        return isDomesticated == mammal.isDomesticated;
    }
}
