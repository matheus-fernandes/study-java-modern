package study.functional.lambdas;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExamples {
    public static void main(String[] args) {
        Comparator<Person> byNameComparison = (person1, person2) ->
                person1.name().compareTo(person2.name());

        Comparator<Person> byAgeComparison =
                Comparator.comparing(Person::age);

        Collection<Person> people = List.of(
                new Person("Anna", 25),
                new Person("Elsa", 28),
                new Person("Olaf", 2)
        );

        people.stream()
                .sorted(byNameComparison)
                .map(Person::name)
                .forEach(System.out::println);

        people.stream()
                .sorted(byAgeComparison)
                .map(Person::age)
                .forEach(System.out::println);
    }

    record Person (String name, Integer age){}
}
