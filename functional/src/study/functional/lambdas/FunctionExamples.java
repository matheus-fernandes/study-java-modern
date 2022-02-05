package study.functional.lambdas;

import java.util.function.Function;

public class FunctionExamples {
    public static void main(String[] args) {
        System.out.println(
            incrementByOne
                .apply(2)
        );

        System.out.println(
            incrementByOne
                .andThen(multiplyByTen)
                .apply(2)
        );

    }

    static Function<Integer, Integer> incrementByOne =
            number -> number + 1;

    static Function<Integer, Integer> multiplyByTen =
            number -> number * 10;
}
