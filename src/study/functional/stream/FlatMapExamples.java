package study.functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class FlatMapExamples {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Bob", 22),
                new Person("Jane", 25),
                new Person("Mary", 25),
                new Person("Vih", 12),
                new Person("Victor", 22)
        );

        Map<Integer, Set<String>> map = people.stream().collect(
                groupingBy(Person::age,
                        mapping(person -> person.name.toUpperCase(),
                            flatMapping(name -> Stream.of(name.split("")),
                                    toSet()))));
        System.out.println(map);
    }

    record Person(String name, int age){}
}
