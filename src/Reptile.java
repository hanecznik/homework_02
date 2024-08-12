public class Reptile extends Animal {
        private boolean isVenomous;

        public Reptile(String species, boolean isVenomous) {
            super(species);
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
