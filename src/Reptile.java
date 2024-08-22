public class Reptile extends Animal implements IVenomous {
        protected boolean isVenomous;

        protected Reptile(String species, Food food, boolean isVenomous) {
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
            return "Species: " + species + ", " + food.getFoodInfo() + ", Venomous: " + isVenomous;
        }

        @Override
        public String toString() {
            return "Reptile [species=" + species + ", food=" + food.getFoodInfo() + ", isVenomous=" + isVenomous + "]";
        }

        @Override
        public int hashCode() {
            return super.hashCode() + Boolean.hashCode(isVenomous);
        }

        @Override
        public boolean equals(Object obj) {
            if (!super.equals(obj)) return false;
            if (getClass() != obj.getClass()) return false;
            Reptile reptile = (Reptile) obj;
            return isVenomous == reptile.isVenomous;
        }

        @Override
        public String getFoodInfo() {
            return null;
        }
}
