package study.timeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatExamples {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String nowFormatted = now.format(formatter);

        System.out.println("Today: " + nowFormatted);

    }
}
