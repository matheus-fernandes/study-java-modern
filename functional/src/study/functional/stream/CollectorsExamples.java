package study.functional.stream;

import study.functional.model.Pet;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExamples {
    public static void main(String[] args) {
        Collection<Pet> pets = List.of(
                new Pet("Bilu", "Bob"),
                new Pet("Mel", "Shara"),
                new Pet("Neo", "Shara"),
                new Pet("Raoni", "Shara")
        );

        List<Pet> list = pets.stream().collect(Collectors.toList());
        System.out.println(list);

        Map<String, Pet> map = pets.stream().collect(Collectors.toMap(
                pet -> pet.name() + "-" + pet.ownerName(),
                pet -> pet
        ));
        System.out.println(map);


        List<Integer> numbers = List.of(1, 2, 3, 1, 2, 3, 4);
        Set<Integer> set = numbers.stream().collect(Collectors.toSet());
        System.out.println(set);

    }

}
