public interface IAquatic {
    String getWaterType();
    default String aquaticInfo() {
        return "This animal lives in water.";
    }
}
