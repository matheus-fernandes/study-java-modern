package study.functional.stream;

import java.util.ArrayList;
import java.util.List;

public class ReduceExamples {
    public static void main(String[] args) {
        List<String> values = List.of(
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
        );

        int total1 = values.stream()
                .map(Integer::parseInt)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(total1);

        int total2 = values.stream()
                .mapToInt(Integer::parseInt).sum();
        System.out.println(total2);

        List<Integer> numbers = values.stream()
                .map(Integer::parseInt)
                .reduce(
                        new ArrayList<Integer>(),
                        (list, number) -> {
                            list.add(number);
                            return list;
                        },
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        }
                );
        System.out.println(numbers);


    }
}
