public class Fish extends Animal implements IAquatic {
    protected String waterType;

    protected Fish(String species, Food food, String waterType) {
        super(species, food);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    @Override
    public String getInfo() {
        return "Species: " + species + ", " + food.getFoodInfo() + ", Water Type: " + waterType;
    }

    @Override
    public String toString() {
        return "Fish [species=" + species + ", food=" + food.getFoodInfo() + ", waterType=" + waterType + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + waterType.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Fish fish = (Fish) obj;
        return waterType.equals(fish.waterType);
    }

    @Override
    public String getFoodInfo() {
        return null;
    }
}
