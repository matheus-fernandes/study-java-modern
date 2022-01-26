package study.functional.lambdas;

import study.functional.model.Person;

import java.util.ArrayList;
import java.util.List;

import static study.functional.model.Gender.FEMALE;
import static study.functional.model.Gender.MALE;

public class GeneralExamples {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("James", MALE),
                new Person("Marie", FEMALE),
                new Person("Rosa", FEMALE),
                new Person("Bob", MALE),
                new Person("Victoria", FEMALE)
        );

        // imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person: people){
            if (FEMALE.equals(person.gender())){
                females.add(person);
            }
        }
        for (Person female: females){
            System.out.println(female);
        }

        // declarative approach
        List<Person> otherFemales = people.stream().filter(
                person -> FEMALE.equals(person.gender())
        ).toList();

        otherFemales.forEach(
                System.out::println
        );
    }
}
