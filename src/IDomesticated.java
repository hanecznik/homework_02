public interface IDomesticated {
    boolean isDomesticated();
    default String domesticatedInfo() {
        return "This animal is domesticated.";
    }
}
