package study.completablefuture;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class ComposeExamples {
    public static void main(String[] args) {
        begin(20)
                .thenCompose(limit -> getAllNumbersTill(limit))
                .thenCompose(numbers -> calculateSumsOf(numbers))
                .thenCompose(sums -> collectSums(sums))
                .thenAccept(System.out::println);

        block();
    }

    public static CompletableFuture<Collection<Integer>> collectSums (IntStream sums) {
        return supplyAsync(
                () -> sums.mapToObj(n -> n).collect(Collectors.toList())
        );
    }

    public static CompletableFuture<Integer> begin (int init){
        return supplyAsync(()->{
            sleep(500);
            return init;
        });
    }

    public static CompletableFuture<IntStream> getAllNumbersTill(int limit){
        return supplyAsync(()-> range(limit));
    }

    public static CompletableFuture<IntStream> calculateSumsOf(IntStream numbers){
        return supplyAsync(()->
            numbers.map(n -> calculateSumTill(n))
        );
    }

    public static Integer calculateSumTill(int limit){
        return range(limit).sum();
    }

    public static IntStream range(int limit){
        return IntStream.range(1, limit + 1);
    }

    public static void sleep(int ms){
        try { Thread.sleep(ms); } catch (Exception e) {}
    }

    public static void block(){
        for (;;) {}
    }
}
