package enumpractice;

public class Main {
    public static void main(String[] args) {
       // using DAY enum
        Day today = Day.THURSDAY;

        if (today == Day.THURSDAY) {
            System.out.println("It's Thursday, the weekend is coming!");
        } else {
            System.out.println("It's not Thursday!");
        }

        // using SIZE enum
        Size size = Size.L;
        System.out.println("Selected size: " + size + ", Description: " + size.getDescription());


        // using OPERATION enum
        int a = 7;
        int b = 21;
        System.out.println("Addition: " + Operation.ADD.apply(a,b));
        System.out.println("Substraction: " + Operation.SUBSTRACT.apply(a,b));
    }
}
