package study.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("blue");
        list.add(1);
        list.add(new Object());

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");

        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors);

        for(String c : colors){
            System.out.println(c);
        }
        colors.forEach(System.out::println);
        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }

        List unmodifiableColors = List.of("blue", "green", "pink");
        unmodifiableColors.forEach(System.out::println);
    }
}
