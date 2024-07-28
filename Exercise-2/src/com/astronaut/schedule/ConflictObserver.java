package com.astronaut.schedule;

import java.util.List;

public class ConflictObserver implements TaskObserver {
    private List<Task> tasks;

    public ConflictObserver(List<Task> tasks) {
        if (tasks == null) {
            throw new IllegalArgumentException("Tasks list cannot be null.");
        }
        this.tasks = tasks;
    }

    @Override
    public void update(Task newTask) throws TaskConflictException {
        for (Task existingTask : tasks) {
            if (isConflict(newTask, existingTask)) {
                throw new TaskConflictException("Task conflicts with existing task \"" + existingTask.getDescription() + "\".");

            }
        }
    }

    private boolean isConflict(Task newTask, Task existingTask) {
        return newTask.getStartTime().compareTo(existingTask.getEndTime()) < 0 &&
               newTask.getEndTime().compareTo(existingTask.getStartTime()) > 0;
    }
}
