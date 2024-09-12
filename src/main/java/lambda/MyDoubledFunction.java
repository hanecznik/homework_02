package lambda;
@FunctionalInterface
public interface MyDoubledFunction<T, U, R> {
    R apply (T variable, U variable2);
}
