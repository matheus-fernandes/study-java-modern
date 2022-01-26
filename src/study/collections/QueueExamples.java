package study.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args){
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Alex", 21));
        supermarket.offer(new Person("Matheus", 22));
        supermarket.offer(new Person("Jane", 30));

        System.out.println(supermarket.peek());
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
    }

    record Person(String name, int age){}
}
