# Design Patterns in Java(Exercise 1)

## Overview

This project demonstrates various software design patterns using Java through practical use cases. Each pattern is implemented in a dedicated section with clear examples and explanations.

## Behavioral Design Patterns

1. **Observer Pattern**:
   - **Use Case**: A stock price monitoring application where multiple clients (observers) are notified whenever there's a change in stock prices.
   - **Explanation**: The stock prices change frequently, and all registered clients need to be updated about the latest prices.

2. **Strategy Pattern**:
   - **Use Case**: A payment processing system where different payment methods (strategies) like Credit Card, PayPal, and Bitcoin can be used interchangeably.
   - **Explanation**: Users can select their preferred payment method at runtime, and the system processes the payment accordingly.

## Creational Design Patterns

3. **Singleton Pattern**:
   - **Use Case**: A configuration manager that ensures a single instance of configuration settings throughout the application.
   - **Explanation**: The application needs a central configuration that can be accessed and modified consistently by different parts of the system.

4. **Factory Pattern**:
   - **Use Case**: A vehicle manufacturing system that creates different types of vehicles (car, bike, truck) using a factory method.
   - **Explanation**: The factory method allows creating objects without specifying the exact class of object that will be created.

## Structural Design Patterns

5. **Adapter Pattern**:
   - **Use Case**: A legacy billing system that needs to integrate with a modern payment gateway.
   - **Explanation**: The adapter converts the interface of the legacy system to be compatible with the modern payment gateway.

6. **Decorator Pattern**:
   - **Use Case**: An order processing system where different types of toppings can be added to a pizza order dynamically.
   - **Explanation**: The decorator pattern allows adding responsibilities to objects at runtime, providing a flexible alternative to subclassing.

## Structure

- `src/Exercise-1/src/Adapter_Pattern/`: Contains the implementation of the adapter pattern.
- `src/Exercise-1/src/Decorator_Pattern/`: Contains the implementation of the decorator pattern.
- `src/Exercise-1/src/Factory_Pattern/`: Contains the implementation of the factory pattern.
- `src/Exercise-1/src/Observer_Pattern/`: Contains the implementation of the observer pattern.
- `src/Exercise-1/src/Singleton_Pattern/`: Contains the implementation of the singleton pattern.
- `src/Exercise-1/src/Strategy_Pattern/`: Contains the implementation of the strategy pattern.
- `README.md`: Project overview and instructions.

## Usage

### Running the Application
To run the demo for each design pattern, execute the corresponding `*PatternDemo.java` file.


