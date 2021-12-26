package ro.fasttrackit.curs12.homework.ex4;

import ro.fasttrackit.curs12.homework.ex2.StringUtils;

import java.util.List;

public class DaySchedule {
    private final WeekDays weekDays;
    private final List<String> activities;

    public DaySchedule(WeekDays weekDays, List<String> activities) {
        this.weekDays = weekDays;
        this.activities = activities;
    }

    public WeekDays getWeekDays() {
        return weekDays;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity (String activity) {
        activities.add(activity);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "weekDays=" + weekDays +
                ", activities=" + activities +
                '}';
    }
}
