package com.astronaut.schedule;

public class Task {
    private String description;
    private String startTime;
    private String endTime;
    private String priority;
    private boolean isCompleted;

    public Task(String description, String startTime, String endTime, String priority) {
        if (description == null || description.isEmpty() || 
            startTime == null || startTime.isEmpty() || 
            endTime == null || endTime.isEmpty() || 
            priority == null || priority.isEmpty()) {
            throw new IllegalArgumentException("Task parameters cannot be null or empty.");
        }
        
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return startTime + " - " + endTime + ": " + description + " [" + priority + "]" + (isCompleted ? " (Completed)" : "");
    }
}
