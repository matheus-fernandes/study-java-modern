package study.functional.stream;

import study.functional.model.Person;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static study.functional.model.Gender.*;

public class MapExamples {
    public static void main(String[] args) {
        // list
        List<Person> people = List.of(
                new Person("James", MALE),
                new Person("Marie", FEMALE),
                new Person("Rosa", FEMALE),
                new Person("Bob", MALE),
                new Person("Victoria", FEMALE),
                new Person("Bob", UNDECLARED)
        );

        // print gender
        people.stream()
                .map(person -> person.gender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // print length of name shorter
        people.stream()
                .map(Person::name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        // print length of name longer
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
        Function<Person, String> name = Person::name;

        people.stream()
                .map(name)
                .mapToInt(length)
                .forEach(println);
    }
}
