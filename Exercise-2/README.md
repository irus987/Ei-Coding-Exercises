# Astronaut Daily Schedule Organizer

## Overview

This Exercise is a console-based application that helps astronauts organize their daily schedules. It demonstrates the use of Singleton, Factory, and Observer design patterns.

## Design Patterns

1. **Singleton Pattern**
   - **Use Case**: Schedule Manager

2. **Factory Pattern**
   - **Use Case**: Task Creation

3. **Observer Pattern**
   - **Use Case**: Task Conflict Notification

Task.java: Represents a task with description, start time, end time, and priority level.

TaskFactory.java: Factory class to create Task objects.

TaskObserver.java: Interface for observers to get notifications about task updates.

ConflictObserver.java: Concrete observer that checks for task conflicts.

ScheduleManager.java: Singleton class that manages tasks.

Logger.java: Utility class for logging.

TaskConflictException.java: Custom exception for task conflicts.

Main.java: Main class to run the application.


