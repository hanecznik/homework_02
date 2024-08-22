public class Constants {
    public static final String FINAL_CONSTANT = "Final Constant";

    static {
        System.out.println("Static block in Constants class.");
    }

    public static void printFinalConstant() {
        System.out.println(FINAL_CONSTANT);
    }
}
