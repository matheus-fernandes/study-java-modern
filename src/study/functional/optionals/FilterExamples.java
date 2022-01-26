package study.functional.optionals;

import study.functional.model.Pet;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FilterExamples {
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

        String message = petWithN
                .filter(pet -> pet.ownerName().startsWith("N"))
                .map(pet -> "Your name match with your pet!")
                .orElse("Your name does not match with your pet!");

        System.out.println(message);
    }
}
