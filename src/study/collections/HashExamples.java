package study.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashExamples {
    public static void main(String[] args){
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African Diamond"));
        System.out.println(map);
    }

    record Person(String name){}
    record Diamond(String name){}
}
