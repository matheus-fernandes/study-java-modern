package study.functional.stream;

import java.util.List;

public class SortDistinctExamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 2, 1, 1, 2, 3);
        // only sorted
        numbers.stream().sorted()
                .forEach(System.out::print);
        System.out.println();

        // only distinct
        numbers.stream().distinct()
                .forEach(System.out::print);
        System.out.println();

        // distinct and sorted
        numbers.stream().distinct().sorted()
                .forEach(System.out::print);
    }
}
