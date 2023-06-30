# Object Oriented Programming with Java: Complete beginners

This repository contains the exercises and examples for the Udemy course "Object Oriented Programming with Java: Complete beginners" by Tilika Kulkarni.

## Table of Contents

- [Introduction](#introduction)
- [Exercises](#exercises)
  - [Exercise 1: Create a Fruit class, constructor, and an object](#exercise-1-create-a-fruit-class-constructor-and-an-object)
  - [Exercise 2: Introducing Methods](#exercise-2-introducing-methods)
  - [Exercise 3: Create methods in the Fruit class](#exercise-3-create-methods-in-the-fruit-class)
- [License](#license)

## Introduction

This course is designed for beginners who want to learn object-oriented programming with Java. It covers the fundamental concepts of object-oriented programming and provides hands-on exercises to reinforce your understanding.

## Exercises

Here are some exercises you can try to practice the concepts covered in the course.

### Exercise 1: Create a Fruit class, constructor, and an object

Create a Java class called `Fruit` with the following properties:

- `name` (String): The name of the fruit.
- `color` (String): The color of the fruit.
- `weight` (int): The weight of the fruit.

Implement a constructor in the `Fruit` class that takes the `name`, `color`, and `weight` as parameters and initializes the corresponding properties.

Create an object of the `Fruit` class, initialize it with values (e.g., `"Strawberry"`, `"Red"`, `10`), and call the `display()` method to print the fruit's information.

### Exercise 2: Introducing Methods

Add the following methods to the `Fruit` class:

- `String getName()`: This method should return the name of the fruit.
- `String getColor()`: This method should return the color of the fruit.
- `void ChangeColor(String newColor)`: This method should update the color of the fruit.

Create a new fruit object, initialize it with values (e.g., `"Lemon"`, `"Yellow"`, `12`), and call the `display()` method to print the fruit's information.

Call the `ChangeColor()` method on the lemon object, passing `"Red"` as the new color. Then, use the `getColor()` method to retrieve and print the updated color.

### Exercise 3: Create methods in the Fruit class

Add the following method to the `Fruit` class:

- `void display()`: This method should display the name, color, and weight of the fruit.

Create additional objects of the `Fruit` class and call the `display()` method on each object to print their information.

## License

This project is licensed under the [MIT License](LICENSE).
