package study.cpfuture;

import java.util.concurrent.CompletableFuture;


public class ExceptionExamples {
    public static void main(String[] args) {
        var completable = new CompletableFuture<Integer>();

        completable
                .thenApply(n -> n * 2)
                .thenApply(n -> {
                    throw new RuntimeException("something goes wrong!");
                }).exceptionally(throwable -> {
                    System.err.println(throwable);
                    return 0;
                }).thenAccept(System.out::println);

        completable.complete(2);
    }
}
