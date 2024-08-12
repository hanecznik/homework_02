public class Reptile extends Animal {
        private boolean isVenomous;

        public Reptile(String species, Food food, boolean isVenomous) {
            super(species, food);
            this.isVenomous = isVenomous;
        }

        public boolean isVenomous() {
            return isVenomous;
        }

        public void setVenomous(boolean isVenomous) {
            this.isVenomous = isVenomous;
        }

        @Override
        public String getInfo() {
            return super.getInfo() + ", Venomous: " + isVenomous;
        }
}
