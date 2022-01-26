package study.timeapi;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExamples {

    public static void main(String[] args){
        LocalTime now = LocalTime.now();
        LocalTime appointment = LocalTime.of(20, 0);
        Duration durationTillAppointment = Duration.between(now, appointment);

        System.out.print("Duration till appointment: ");
        System.out.println(durationTillAppointment.getSeconds() + " hours");
    }
}
