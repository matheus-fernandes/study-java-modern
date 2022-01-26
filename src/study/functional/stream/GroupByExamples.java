package study.functional.stream;

import study.functional.model.Pet;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupByExamples {
    public static void main(String[] args) {
        Collection<Pet> pets = List.of(
                new Pet("Bilu", "John"),
                new Pet("Mel", "Vih"),
                new Pet("Neo", "Vih"),
                new Pet("Raoni", "Vih"),
                new Pet("Raoni", "Vih")
        );

        Map<String, List<Pet>> listFromDownstream = pets.stream().collect(
                Collectors.groupingBy(
                        Pet::ownerName,
                        Collectors.toList()
                )
        );
        System.out.println(listFromDownstream);

        Map<String, Set<String>> listFromMapFactory = pets.stream().collect(
                Collectors.groupingBy(
                        Pet::ownerName,
                        Collectors.mapping(
                                Pet::name,
                                Collectors.toSet()
                        )
                )
        );
        System.out.println(listFromMapFactory);
    }
}
