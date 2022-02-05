package study.cpfuture;

import java.util.concurrent.CompletableFuture;

public class IntroExamples {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return 2;
        }).thenApply(number -> {
            sleep(1000);
            return number * 2;
        }).thenAccept(number -> {
            System.out.println("n1:" + number);
        });

        CompletableFuture.supplyAsync(() -> {
            sleep(900);
            return 2;
        }).thenApply(number -> {
            sleep(900);
            return number * 2;
        }).thenAccept(number -> {
            System.out.println("n2:" + number);
        });

        block();
    }

    static void block(){
        for(;;){}
    }

    static void sleep(int millis){
        try { Thread.sleep(1000); }
        catch (Exception e) { }
    }
}
