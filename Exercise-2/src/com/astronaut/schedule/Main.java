package com.astronaut.schedule;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager scheduleManager = ScheduleManager.getInstance();
        scheduleManager.addObserver(new ConflictObserver(scheduleManager.getTasks()));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.println("Astronaut Daily Schedule Organizer");
                System.out.println("1. Add Task");
                System.out.println("2. Remove Task");
                System.out.println("3. View Tasks");
                System.out.println("4. Edit Task");
                System.out.println("5. Mark Task as Completed");
                System.out.println("6. View Tasks by Priority");
                System.out.println("7. Exit");

                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        System.out.println("Enter task description:");
                        String description = scanner.nextLine().trim();
                        System.out.println("Enter start time (HH:MM):");
                        String startTime = scanner.nextLine().trim();
                        System.out.println("Enter end time (HH:MM):");
                        String endTime = scanner.nextLine().trim();
                        System.out.println("Enter priority (High, Medium, Low):");
                        String priority = scanner.nextLine().trim();
                        try {
                            Task task = TaskFactory.createTask(description, startTime, endTime, priority);
                            scheduleManager.addTask(task);
                        } catch (IllegalArgumentException e) {
                            Logger.logError(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Enter task description to remove:");
                        String removeDescription = scanner.nextLine().trim();
                        scheduleManager.removeTask(removeDescription);
                        break;
                    case 3:
                        scheduleManager.viewTasks();
                        break;
                    case 4:
                        System.out.println("Enter task description to edit:");
                        String editDescription = scanner.nextLine().trim();
                        System.out.println("Enter new task description:");
                        String newDescription = scanner.nextLine().trim();
                        System.out.println("Enter new start time (HH:MM):");
                        String newStartTime = scanner.nextLine().trim();
                        System.out.println("Enter new end time (HH:MM):");
                        String newEndTime = scanner.nextLine().trim();
                        System.out.println("Enter new priority (High, Medium, Low):");
                        String newPriority = scanner.nextLine().trim();
                        try {
                            Task newTask = TaskFactory.createTask(newDescription, newStartTime, newEndTime, newPriority);
                            scheduleManager.editTask(editDescription, newTask);
                        } catch (IllegalArgumentException e) {
                            Logger.logError(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Enter task description to mark as completed:");
                        String completeDescription = scanner.nextLine().trim();
                        scheduleManager.markTaskCompleted(completeDescription);
                        break;
                    case 6:
                        System.out.println("Enter priority (High, Medium, Low) to view tasks:");
                        String viewPriority = scanner.nextLine().trim();
                        scheduleManager.viewTasksByPriority(viewPriority);
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        running = false;
                        break;
                    default:
                        Logger.logError("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                Logger.logError("Invalid input. Please enter a number.");
            } catch (Exception e) {
                Logger.logError("An unexpected error occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
