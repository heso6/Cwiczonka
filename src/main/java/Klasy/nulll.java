package Klasy;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class nulll {
    public static void main(String[] args) {

        LocalDate myDate = LocalDate.of(2018, 1, 5);
        System.out.println(myDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)));
    }

}

