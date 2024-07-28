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

## Output ScreenShots

![image](https://github.com/user-attachments/assets/08f8ff33-379b-4c78-bb5f-42a70c211313)

![image](https://github.com/user-attachments/assets/c7a36a0b-6f0f-435d-9322-4a967d439780)

![image](https://github.com/user-attachments/assets/881be235-52bb-4d7c-a9eb-7a5298d72825)

![image](https://github.com/user-attachments/assets/ac01cb04-24f5-4780-97b6-259dcdda1c8f)

![image](https://github.com/user-attachments/assets/2cf3bbde-24a4-45a8-b542-a7829b923386)

![image](https://github.com/user-attachments/assets/5ddb2132-760c-40f8-97fb-47a9e59d0851)

![image](https://github.com/user-attachments/assets/cf0b5d65-e97d-4840-a56c-6d6b5b9e2571)

![image](https://github.com/user-attachments/assets/93810938-eb2d-4283-b5d1-b9ac78f6430c)




