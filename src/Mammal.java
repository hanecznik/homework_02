public class Mammal extends Animal {
    private boolean isDomesticated;

    public Mammal(String species, boolean isDomesticated) {
        super(species);
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
        return super.getInfo() + ", Domesticated: " + isDomesticated;
    }
}
