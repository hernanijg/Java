# 🏢 Company People Management System

This Java project provides a simple object-oriented structure to represent people in a company environment. It includes different roles such as **Client**, **Employee**, and **Manager**, all inheriting from a common base class `Person`. It's a great example for understanding inheritance, encapsulation, constructors, method overriding, and class relationships in Java.

## ▶️ How to Run

1. Compile all `.java` files:
```bash
javac Assignment/CompanyPeople/*.java
```
2. Run the main class:
```bash
java Assignment._12CompanyPeople.Consume
```
---

## 🧱 Class Overview

### 🧑 `Person` (Base Class)
Holds general information like:
- Name
- Last name
- Fiscal number
- Address

### 👤 `Client` (extends `Person`)
- Auto-increments and assigns a unique `clientId` to each client.

### 👨‍💼 `Employee` (extends `Person`)
- Has a salary (`remuneration`)
- Auto-increments an `employeeId`

### 🧑‍💼 `Manager` (extends `Employee`)
- Inherits all from `Employee` and adds a `budget` field.

---
## 🧪 Output Example
```yaml
===== New Employer Info:
Name: Jhon
LastName: Doe
Fiscal Number: 5555-5
Address: Sheridan rd, Illinois
Employee Id: 1

===== New Manager:
Name: Noor
LastName: Astiyarte
Fiscal Number: 3333-4
Address: guess, California
Remuneration: 20.0
Employee Id: 2
Budget: 44.4

===== New Client:
Client ID: 0
Client Full Name: Marilyn Gonzalez

```
