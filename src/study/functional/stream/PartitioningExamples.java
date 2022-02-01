package study.functional.stream;

import study.functional.model.Gender;
import study.functional.model.Person;
import study.functional.model.Pet;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PartitioningExamples {
    public static void main(String[] args) {
        Collection<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Marie", Gender.FEMALE),
                new Person("Bob", Gender.MALE),
                new Person("Jessica", Gender.FEMALE)
        );

        Map<Boolean, List<Person>> partitionedPeople = people.stream()
                .collect(Collectors.partitioningBy(
                        person -> Gender.FEMALE.equals(person.gender())
                ));

        Function<List<Person>, String> extractName =
                (peoplePartition) -> peoplePartition.stream()
                    .map(Person::name)
                    .collect(Collectors.joining(", ", "(", ")" ));

        partitionedPeople.forEach((isFemale, peoplePartition) -> {
            String names = extractName.apply(peoplePartition);

            if (isFemale) {
                System.out.println("Hi, " + names + " you're welcome!");
            }
            else {
                System.out.println("I'm sorry, " + names + " it's a female student house...");
            }
        });
    }
}
