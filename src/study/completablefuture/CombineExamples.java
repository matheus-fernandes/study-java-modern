package study.completablefuture;
import static java.util.concurrent.CompletableFuture.*;
import java.util.concurrent.ExecutionException;

public class CombineExamples {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var multiplication = supplyAsync(() -> 2)
                .thenApply(n -> {
                    sleep(1000);
                    return n * 2;
                });

        var sum = supplyAsync(() -> 2)
                .thenApply(n -> {
                    sleep(500);
                    return n + 2;
                });

        sum.thenCombine(multiplication, (n1, n2) -> n1 + n2)
                .thenAccept(System.out::println);

        block();
    }

    public static void sleep(int ms){
        try { Thread.sleep(ms); } catch (Exception e) {}
    }

    public static void block(){
        for (;;) {}
    }
}
