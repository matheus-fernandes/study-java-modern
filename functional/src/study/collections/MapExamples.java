package study.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args){
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam"));
        map.put(3, new Person("Mariam 2"));

        System.out.println();
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());
        System.out.println();

        map.entrySet().forEach((entry)->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
        System.out.println();

        map.forEach((key, person)->{
            System.out.println(key + " - " + person);
        });

        Map<String, Person> map2 = Map.of(
                "a", new Person("Alex"),
                "b", new Person("Mariam"),
                "c", new Person("Bob")
        );

        Map<String, Person> resultMap = new HashMap(map);
        resultMap.values().retainAll(map2.values());
        System.out.println(resultMap);
        // print the intersection between map and map2

    }

    record Person(String name){}
}
