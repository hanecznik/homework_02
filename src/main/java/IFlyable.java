public interface IFlyable {
    boolean canFly();
    default String flyAbility() {
        return "This animal can fly.";
    }
}
