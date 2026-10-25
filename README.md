# Bird Behavior Design

## Overview
A simple Java project demonstrating object-oriented programming (OOP), interfaces, abstraction, and the Strategy Design Pattern through different bird behaviors.

## Concepts Demonstrated
- **Abstraction:** An abstract `Bird` class defines common properties and behaviors.
- **Inheritance:** Different bird classes extend the `Bird` class.
- **Interfaces:** Interfaces define flying and non-flying behavior contracts.
- **Polymorphism:** Different implementations provide different flying behaviors.
- **Strategy Design Pattern:** Flying behavior is separated from bird classes, allowing different flying strategies to be used.
- **Dependency Inversion Principle (DIP):** Bird behavior is managed through abstractions rather than depending directly on specific implementations.

## Project Structure
```text
Bird-Behavior-Design/
└── Main.java
```

## Birds Implemented
- **Crow:** Uses a flapping-based flying strategy.
- **Sparrow:** Uses a flapping-based flying strategy.
- **Pigeon:** Uses a separate flying strategy.
- **Penguin:** Represents a non-flying bird.
- **Ostrich:** Represents a non-flying bird.

## Technologies Used
- Java
- Object-Oriented Programming
- Strategy Design Pattern

## How to Run

1. Install the Java Development Kit (JDK).
2. Open a terminal in the project directory.
3. Compile the program:

   ```bash
   javac Main.java
   ```

4. Run the program:

   ```bash
   java Main
   ```

## Learning Objective
This project demonstrates how to separate behavior from the classes that use it, making code easier to maintain, extend, and reuse.
