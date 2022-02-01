package study.functional.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class MaxMinByExamples {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Bob", 22),
                new Person("Jane", 25),
                new Person("Mary", 21),
                new Person("Vih", 12)
        );

        String nameOfOldest = people.stream().collect(
                maxBy(comparing(Person::age)))
                .map(Person::name)
                .orElse("");

        String nameOfYoungest = people.stream().collect(
                minBy(comparing(Person::age)))
                .map(Person::name)
                .orElse("");

        System.out.println(nameOfOldest);
        System.out.println(nameOfYoungest);
    }

    record Person(String name, int age){}
}
