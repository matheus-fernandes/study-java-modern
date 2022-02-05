package study.functional.stream;

import java.util.List;

public class MapIntExamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Integer sumOfTriple = numbers.stream()
                .mapToInt(n -> n * 3)
                .sum();

        Integer maxOfTriple = numbers.stream()
                .mapToInt(n -> n * 3)
                .max().orElse(0);

        Integer minOfTriple = numbers.stream()
                .mapToInt(n -> n * 3)
                .min().orElse(0);

        System.out.println(sumOfTriple);
        System.out.println(maxOfTriple);
        System.out.println(minOfTriple);

    }
}
