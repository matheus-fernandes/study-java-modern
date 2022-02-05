package study.functional.lambdas;

import study.functional.model.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static study.functional.model.Gender.FEMALE;
import static study.functional.model.Gender.MALE;

public class PredicateExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Matheus", MALE),
                new Person("Michelle", FEMALE)
        );

        Predicate<Person> checkIsFemale= (Person person) ->
                FEMALE.equals(person.gender());

        System.out.println(
                people.stream()
                    .filter(checkIsFemale)
                    .collect(Collectors.toList())
        );

        Predicate<String> checkIsPhoneValid = (phone) ->
                phone.startsWith("07") && phone.length() == 11;

        System.out.println(
                checkIsPhoneValid.test("07 99998888")
        );

    }

}
