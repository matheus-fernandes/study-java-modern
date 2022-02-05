package study.cpfuture;

import java.util.concurrent.CompletableFuture;

public class LazyExamples {
    public static void main(String[] args) {
        var future = new CompletableFuture<Integer>();

        future
                .thenApply(data -> data * 2)
                .thenApply(data -> data + 1)
                .thenAccept(data -> System.out.println(data));

        future.complete(2);
    }
}
