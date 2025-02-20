---
layout: default
title: Greeter Java Code Explanation and OOP Principles
---

# `Greeter` Java Code Explanation and OOP Principles

## Code Explanation 
1. Access Modifiers:
	- `private`: Only accessible within the same class
	  - Example: `private final String name;` means only methods inside the Greeter class can access this variable
	- `public`: Accessible from any other class
	  - Example: `public class Greeter` means other classes can use this class
	  - `public void printGreetings()` means other classes can call this method

2. `static` modifier:
	- Belongs to the class itself, not to any specific instance
	- Can be used without creating an object of the class
	- Example: `private static final String DEFAULT_NAME`
	  - This variable is shared across all Greeter instances
	  - The same default name is available to all objects
	- `public static void main(String[] args)`
	  - The main method is static because it needs to run without creating an object

3. `final` modifier:
	- For variables: Once assigned, value cannot be changed (like const in other languages)
	  - Example: `private final String name;` - name cannot be modified after initialization
	- For static variables: Creates a constant
	  - Example: `private static final String DEFAULT_NAME` - a constant default value

4. `void` return type:
	- Indicates the method doesn't return any value
	- Example: `public void printGreetings()` - prints to console but doesn't return anything

The code demonstrates several OOP concepts:

1. Encapsulation:
	- Private fields (`name`, `campus`) protect data from external access
	- Public methods provide controlled access to object functionality

2. Constructor:

```java
	public Greeter(String name, String campus) {
	    this.name = name;
	    this.campus = campus;
	}
```

	- Initializes new objects
	- `this` keyword refers to the current instance
	- Sets the initial state of object properties

3. Instance Methods vs Static Methods:
	- Instance method: `printGreetings()` - operates on object data
	- Static method: `main()` - runs independently of any object

4. Object Creation:

```java
Greeter workshopGreeter = new Greeter(participantName, participantCampus);
```
	
	- Creates a new instance of Greeter class
	- Calls constructor with specific parameters

## OOP Principles
The four main principles of Object-Oriented Programming (OOP) are:

1. **Encapsulation**
- Bundles related data and methods that operate on that data within a single unit/class
- Controls access to internal details through access modifiers (private, public, protected)
- Example:

```java
public class BankAccount {
    private double balance;  // Data is hidden
    
    public void deposit(double amount) {  // Public interface
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

1. **Inheritance**
- Allows a class to inherit properties and methods from another class
- Enables code reuse and establishes a relationship between parent and child classes
- Example:

```java
public class Animal {
    protected String name;
    public void eat() { ... }
}

public class Dog extends Animal {  // Dog inherits from Animal
    public void bark() { ... }
}
```

1. **Polymorphism**
- Ability of objects to take multiple forms
- Includes method overriding (runtime) and method overloading (compile-time)
- Example:

```java
public class Shape {
    public double getArea() { return 0; }
}

public class Circle extends Shape {
    private double radius;
    
    @Override
    public double getArea() {  // Method overriding
        return Math.PI * radius * radius;
    }
}

public class Calculator {
    // Method overloading
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
}
```

2. Abstraction
- Hides complex implementation details and shows only necessary features
- Achieved through abstract classes and interfaces
- Example:

```java
public interface DatabaseConnection {
    void connect();
    void disconnect();
    void executeQuery(String query);
}

public class MySQLConnection implements DatabaseConnection {
    // Concrete implementation of abstract methods
    public void connect() {
        // Complex connection logic hidden from users
    }
}
```

Benefits of following these principles:
- More maintainable and organized code
- Better code reusability
- Reduced complexity
- Easier debugging
- Better data security
- More flexible and extensible systems
- 

### Go Back to [Homepage](https://hackersclubsv.github.io/coe-coding-basics-bootcamp/)
