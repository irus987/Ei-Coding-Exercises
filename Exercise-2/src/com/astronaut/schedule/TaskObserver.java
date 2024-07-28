package com.astronaut.schedule;

public interface TaskObserver {
    void update(Task task) throws TaskConflictException;
}
