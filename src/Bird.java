public class Bird extends Animal {
    private boolean canFly;

    public Bird(String species, boolean canFly) {
        super(species);
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
