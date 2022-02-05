package study.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExamples {
    public static void main(String[] args){
        LinkedList<Person> linked = new LinkedList<>();
        linked.add(new Person("Alex", 30));
        linked.add(new Person("John", 20));
        linked.add(new Person("Marie", 26));
        linked.addFirst(new Person("Michelle", 27));
        linked.addLast(new Person("Matheus", 20));

        ListIterator<Person> inPeople = linked.listIterator();

        while(inPeople.hasNext()){
            System.out.println(inPeople.next());
        }

        while(inPeople.hasPrevious()){
            System.out.println(inPeople.previous());
        }
    }

    record Person(String name, int age){}
}
