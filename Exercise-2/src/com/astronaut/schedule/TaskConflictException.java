package com.astronaut.schedule;

public class TaskConflictException extends Exception {
    public TaskConflictException(String message) {
        super(message);
    }
}
