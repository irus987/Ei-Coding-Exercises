package com.astronaut.schedule;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class TaskFactory {
    public static Task createTask(String description, String startTime, String endTime, String priority) throws IllegalArgumentException {
        if (!isValidTimeFormat(startTime) || !isValidTimeFormat(endTime)) {
            throw new IllegalArgumentException("Invalid time format. ");
        }
        return new Task(description, startTime, endTime, priority);
    }

    private static boolean isValidTimeFormat(String time) {
        try {
            LocalTime.parse(time);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
