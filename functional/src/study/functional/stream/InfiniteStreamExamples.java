package study.functional.stream;

import java.util.stream.Stream;

public class InfiniteStreamExamples {
    public static void main(String[] args) {
        Integer beginning = 100;
        Integer nextMultipleByThirteen = Stream
                .iterate(beginning, e -> e + 1)
                .filter(n -> n % 13 == 0)
                .findFirst()
                .orElse(13);
        System.out.println("Multiple: " + nextMultipleByThirteen);

        Integer maxSize = 2;
        Integer sumOfEvens = Stream
                .iterate(beginning, e -> e + 1)
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .limit(maxSize)
                .sum();
        System.out.println("Sum: " + sumOfEvens);

    }
}
