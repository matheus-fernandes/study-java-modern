package study.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args){
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("yellow"));
        balls.forEach(System.out::println);

        System.out.println();

        Set<Ball> orderedBalls = new TreeSet<>();
        orderedBalls.add(new Ball("blue"));
        orderedBalls.add(new Ball("blue"));
        orderedBalls.add(new Ball("yellow"));
        orderedBalls.add(new Ball("red"));
        orderedBalls.add(new Ball("yellow"));
        orderedBalls.add(new Ball("anil"));
        orderedBalls.forEach(System.out::println);
    }

    record Ball(String color) implements Comparable{
        @Override
        public int compareTo(Object o) {
            if (o instanceof Ball b) {
                return this.color.compareTo(b.color);
            }

            return 1;
        }
    }
}
