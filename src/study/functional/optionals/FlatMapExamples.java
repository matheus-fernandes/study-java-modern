package study.functional.optionals;

import study.functional.model.Person;
import study.functional.model.Pet;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static study.functional.model.Gender.*;

public class FlatMapExamples {

    static List<Person> people = List.of(
            new Person("James", MALE),
            new Person("Marie", FEMALE),
            new Person("Rosa", FEMALE),
            new Person("John", MALE),
            new Person("Vih", FEMALE),
            new Person("Bob", UNDECLARED)
    );

    static Optional<Person> findPersonByName(String name){
        return people.stream()
                .filter(person -> person.name().equals(name))
                .findAny();
    }

    public static void main(String[] args) {
        Collection<Pet> pets = List.of(
                new Pet("Bilu", "John"),
                new Pet("Mel", "Vih"),
                new Pet("Mike", "Rosa"),
                new Pet("Neo", "Vih"),
                new Pet("Raoni", "Rosa"),
                new Pet("Raoni", "Vih")
        );

        Collection<Person> ownersOfPets = pets.stream()
                .map(Pet::ownerName)
                .map(FlatMapExamples::findPersonByName)
                .flatMap(Optional::stream)
                .collect(Collectors.toSet());

        System.out.println(ownersOfPets);
    }
}
