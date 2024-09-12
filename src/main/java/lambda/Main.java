package lambda;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // A lambda function - takes Sting & returns its length
        MyFunction<String, Integer> lengthFunction = variable-> variable.length();

        // calling the apply method via a lambda reference
        System.out.println("Length of 'Lambda': " + lengthFunction.apply("Lambda"));



        // lambda function - checks if a number is even
        MyPredicate<Integer> boolFunction = number -> number % 2 == 0;
        System.out.println("Is 4 even number? " + boolFunction.test(4));
        System.out.println("Is 7 even number? " + boolFunction.test(7));



        // lambda function - sums two numbers
        MyDoubledFunction<Integer, Integer, Integer> sumFunction = (a, b) -> a + b;
        System.out.println("Sum of 5 and 9: " + sumFunction.apply(5, 9));


        // built-in interface Supplier - return random number + run get() method (built into interface)
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number: " + randomNumber.get());
    }
}
