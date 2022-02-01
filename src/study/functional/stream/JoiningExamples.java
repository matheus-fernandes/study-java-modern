package study.functional.stream;

import study.functional.model.Pet;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExamples {
    public static void main(String[] args) {
        Collection<Pet> pets = List.of(
                new Pet("Bilu", "Bob"),
                new Pet("Mel", "Shara"),
                new Pet("Neo", "Shara"),
                new Pet("Raoni", "Shara")
        );

        String names = pets.stream()
                .map(Pet::name)
                .collect(Collectors.joining(", "));

        System.out.println(names);
    }
}
