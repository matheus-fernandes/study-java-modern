package study.functional.stream;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterExamples {
    public static void main(String[] args) {
        List<String> values = List.of(
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "2", "4"
        );

        Collection<Integer> evens = values.stream()
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(evens);
    }
}
