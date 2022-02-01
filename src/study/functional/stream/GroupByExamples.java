package study.functional.stream;

import study.functional.model.Pet;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupByExamples {
    public static void main(String[] args) {
        Collection<Pet> pets = List.of(
                new Pet("Bilu", "John"),
                new Pet("Mel", "Vih"),
                new Pet("Neo", "Vih"),
                new Pet("Raoni", "Vih"),
                new Pet("Raoni", "Vih")
        );

        Map<String, List<Pet>> petsByOwner = pets.stream().collect(
                groupingBy(Pet::ownerName, toList()));

        Map<String, Set<String>> petsNameByOwner = pets.stream().collect(
                groupingBy(Pet::ownerName,
                        mapping(Pet::name,toSet())));

        Map<String, Long> petsQuantityByOwner = pets.stream().collect(
                groupingBy(Pet::ownerName, counting()));

        Map<String, Integer> petsIntegerQuantityByOwner = pets.stream().collect(
                groupingBy(Pet::ownerName, collectingAndThen(
                        counting(), Long::intValue)));

        Predicate<Pet> hasShortName = pet -> pet.name().length() <= 3;

        Map<String, Set<String>> petsWithShortNameByOwner = pets.stream()
                .filter(hasShortName).collect(
                        groupingBy(Pet::ownerName,
                                mapping(Pet::name, toSet())));

        System.out.println(petsByOwner);
        System.out.println(petsNameByOwner);
        System.out.println(petsQuantityByOwner);
    }
}
