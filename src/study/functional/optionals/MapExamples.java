package study.functional.optionals;

import study.functional.model.Gender;
import study.functional.model.Person;
import study.functional.model.Pet;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class MapExamples {
    public static void main(String[] args) {
        Collection<Pet> pets = List.of(
                new Pet("Bilu", "John"),
                new Pet("Mel", "Vih"),
                new Pet("Neo", "Vih"),
                new Pet("Raoni", "Vih"),
                new Pet("Raoni", "Vih")
        );

        Optional<Pet> petWithN = pets.stream()
                .filter(pet -> pet.name().startsWith("N"))
                .findAny();

        Optional<Pet> petWithL = pets.stream()
                .filter(pet -> pet.name().startsWith("L"))
                .findAny();

        String nameWithN = petWithN
                .map(Pet::name)
                .orElse("(no pet with found)");

        String nameWithL = petWithL
                .map(Pet::name)
                .orElse("(no pet with found)");

        System.out.println(
                "Pet with N: " + nameWithN
        );

        System.out.println(
                "Pet with L: " + nameWithL
        );
    }
}
