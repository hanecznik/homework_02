public interface IVenomous {
    boolean isVenomous();
    default String venomInfo() {
        return "This animal is venomous.";
    }
}
