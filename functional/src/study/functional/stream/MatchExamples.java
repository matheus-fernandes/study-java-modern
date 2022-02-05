package study.functional.stream;

import study.functional.model.Person;

import java.util.List;
import java.util.function.Predicate;

import static study.functional.model.Gender.*;

public class MatchExamples {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("James", MALE),
                new Person("Marie", FEMALE),
                new Person("Rosa", FEMALE),
                new Person("Bob", MALE),
                new Person("Victoria", FEMALE),
                new Person("Bob", UNDECLARED)
        );

        // all match
        Predicate<Person> isFemale = person -> FEMALE.equals(person.gender());
        boolean areAllFemales = people.stream().allMatch(isFemale);
        System.out.println("All females: " + areAllFemales);

        // any match
        boolean hasAnyFemale = people.stream().anyMatch(isFemale);
        System.out.println("Has any female: " + hasAnyFemale);

        // none undeclared
        Predicate<Person> isUndeclared = person -> UNDECLARED.equals(person.gender());
        boolean hasNotUndeclared = people.stream().noneMatch(isUndeclared);
        System.out.println("Has not undeclared: " + hasNotUndeclared);
    }
}
