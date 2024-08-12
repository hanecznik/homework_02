public class Bird extends Animal {
    private boolean canFly;

    public Bird(String species, Food food, boolean canFly) {
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
        return super.getInfo() + ", Can Fly: " + canFly;
    }
}
