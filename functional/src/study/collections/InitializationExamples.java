package study.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class InitializationExamples {
    public static void main(String[] args) {
        List<String> list = List.of("Matt", "Bob", "James");

        Set<String> set = Set.of("Matt", "Bob", "James");

        Map<String, Integer> map1 = Map.of(
                "Matt", 20, "James", 21);

        Map<String, Integer> map2 = Map.ofEntries(
                Map.entry("Matt", 20),
                Map.entry("James", 21)
        );
    }
}
