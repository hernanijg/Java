# 🏪 Product Warehouse System

A simple **object-oriented Java application** that models a warehouse system storing various product types such as fruits, cleaning items, snacks, and dairy. The design uses inheritance and polymorphism to represent shared and unique attributes across product categories.

## 📦 Overview

This system provides a clear structure for:

- Creating and managing different product types
- Demonstrating the power of **inheritance**, **constructor overloading**, and **polymorphic behavior**
- Printing product details in a clean, formatted way

## 🚀 How to Run

1. Clone the project or copy the files to your Java workspace.
2. Compile all classes inside the `Assignment/_13ProductoWarehouse/` package.
3. Run the `Consume` class:
   ```bash
   javac Assignment/_13ProductoWarehouse/*.java
   java Assignment._13ProductoWarehouse.Consume
    ```

---
## 🧱 Class Summary

| Class           | Description |
|----------------|-------------|
| `Product`       | The abstract base class with common attributes like `name`, `price`, and `id`. |
| `Fruit`         | Represents fruits, with properties like `weight` and `color`. |
| `Cleaning`      | Represents cleaning products, defined by `component` and `liters`. |
| `NotPerceivable`| Represents snack-type items, with `content` (grams) and `calories`. |
| `Milk`          | Represents dairy products, defined by `count` (e.g., quantity) and `protein`. |
| `Consume`       | Main class that initializes and prints out an array of mixed products. |


## Sample Output
```yaml
Welcome to product list: #1
Name: Apple
Price: 0.39
Color: Red
Weight: 1.2

Welcome to product list: #2
Name: Apple
Price: 0.49
Color: Green
Weight: 0.98

Welcome to product list: #3
Name: Desifectante
Price: 4.99
Component: Chloruro
Liters: 1.0

...
```

## 👨‍💻 Author
Created by Hernani Gonzalez — for educational purposes and practicing Java OOP.
