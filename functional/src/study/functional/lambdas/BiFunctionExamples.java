package study.functional.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExamples {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum =
                (a, b) -> a + b;

        Function<Integer, Integer> square =
                (a) -> a * a;

        System.out.println(
            sum.andThen(square)
                .apply(2, 3)
        );

    }
}
