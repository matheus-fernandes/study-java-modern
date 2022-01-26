package study.functional.stream;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.IsoFields;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelExamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 1, 2, 3);

        System.out.println("Parallel:");
        measureTime(() -> numbers.parallelStream()
            .map(ParallelExamples::costlyOperation)
            .collect(Collectors.toSet())
        );

        System.out.println("\nSequential:");
        measureTime(() -> numbers.stream()
            .map(ParallelExamples::costlyOperation)
            .collect(Collectors.toSet())
        );
    }

    static void measureTime(Runnable runnable){
        LocalTime start = LocalTime.now();
        runnable.run();
        LocalTime end = LocalTime.now();

        Duration duration = Duration.between(start, end);
        System.out.println(
                "Duration: " + duration.toMillis() + "ms"
        );
    }

    static int costlyOperation(Integer i){
        try {Thread.sleep(1000);}
        catch(Exception e) {}

        return i * 2;
    }
}
