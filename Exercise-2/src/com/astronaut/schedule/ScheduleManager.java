package com.astronaut.schedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<TaskObserver> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static synchronized ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(TaskObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null.");
        }
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null.");
        }
        try {
            for (TaskObserver observer : observers) {
                observer.update(task);
            }
            tasks.add(task);
            Collections.sort(tasks, Comparator.comparing(Task::getStartTime));
            Logger.log("Task added successfully. No conflicts.");
        } catch (TaskConflictException e) {
            Logger.logError(e.getMessage());
        }
    }

    public void removeTask(String description) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                taskToRemove = task;
                break;
            }
        }

        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            Logger.log("Task removed successfully.");
        } else {
            Logger.logError("Task not found.");
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            Logger.log("No tasks scheduled for the day.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void editTask(String description, Task newTask) {
        if (description == null || description.isEmpty() || newTask == null) {
            throw new IllegalArgumentException("Description and new task cannot be null or empty.");
        }
        removeTask(description);
        addTask(newTask);
    }

    public void markTaskCompleted(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.setCompleted(true);
                Logger.log("Task marked as completed.");
                return;
            }
        }
        Logger.logError("Error: Task not found.");
    }

    public void viewTasksByPriority(String priority) {
        if (priority == null || priority.isEmpty()) {
            Logger.logError("Priority cannot be null or empty.");
            return;
        }
        boolean hasTasks = false;
        for (Task task : tasks) {
            if (task.getPriority().equalsIgnoreCase(priority)) {
                System.out.println(task);
                hasTasks = true;
            }
        }
        if (!hasTasks) {
            Logger.log("No tasks found with priority " + priority + ".");
        }
    }
}
