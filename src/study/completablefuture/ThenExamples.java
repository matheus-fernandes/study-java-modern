package study.completablefuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static java.util.concurrent.CompletableFuture.*;

public class ThenExamples {
    public static void main(String[] args) {
        supplyAsync(() -> List.of(1, 2, 3))
                .thenAccept(list -> {
                    list.remove(0);
                });

        supplyAsync(() -> 2)
                .thenApply(n -> n * 2);
    }
}
