package study.functional.lambdas;

import java.util.function.Consumer;

public class RunnableExamples {
    public static void main(String[] args) {
        Consumer<Runnable> consumer = (callback) -> {
            System.out.print("calling ");
            callback.run();
        };

        Runnable callback1 = () -> {
            System.out.println("callback 1!");
        };

        Runnable callback2 = () -> {
            System.out.println("callback 2!");
        };

        consumer.accept(callback1);
        consumer.accept(callback2);
    }
}
