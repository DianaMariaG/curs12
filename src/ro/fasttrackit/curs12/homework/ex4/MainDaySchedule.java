package ro.fasttrackit.curs12.homework.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ro.fasttrackit.curs12.homework.ex4.WeekDays.*;

public class MainDaySchedule {
    public static void main(String[] args) {
        DaySchedule day1 = new DaySchedule(WeekDays.MONDAY, new ArrayList<>(Arrays.asList("run","write","read")));
        day1.addActivity("wash dishes");
        System.out.println(day1);

        DaySchedule day2 = new DaySchedule(FRIDAY, List.of("swim","paint","drive"));
        System.out.println(day2);

        DaySchedule day3 = new DaySchedule(WEDNESDAY, List.of("cook","learn","sport"));
        day3.addActivity("scuba");
        System.out.println(day3);
    }

}
