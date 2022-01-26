package study.timeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExamples {

    public static void main(String[] args){
        LocalDateTime nowHere = LocalDateTime.now();

        ZoneId zoneIdTokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime nowTokyo = ZonedDateTime.of(nowHere, zoneIdTokyo);

        System.out.println(nowTokyo);

    }

}
