# Advanced Java — Java 3
### Islamic University of Gaza (IUG)
#### Faculty of Information Technology

---

> Course material repository for **Advanced Java (Java 3)** at the Islamic University of Gaza (IUG), Faculty of Computer Science.
> Maintained by Teaching Assistant **Aya Nabil Alharazin**.
> Contains structured lecture notes and Lab 1 material covering core Java Object-Oriented Programming topics.

---

## Table of Contents

- [About](#about)
- [Course Information](#course-information)
- [Content Overview](#content-overview)
- [Lecture — Java OOP Topics](#lecture--java-oop-topics)
- [Lab 1 — Java OOP Practice](#lab-1--java-oop-practice)
- [Repository Structure](#repository-structure)
- [How to Use This Repo](#how-to-use-this-repo)
- [Tools & Setup](#tools--setup)
- [Academic Integrity](#academic-integrity)
- [Contact](#contact)

---

## About

This repository serves as the **official teaching assistant resource hub** for the Advanced Java (Java 3) course at IUG. It is designed to support students with well-organized and clearly explained material that complements the in-class sessions.

All content is prepared and maintained by **Aya Nabil Alharazin** and includes:

- 📝 **Lecture Slide** — detailed written explanations for all 13 OOP topics
- 💻 **Lab 1 source code** — annotated, runnable Java examples

---

## Course Information

| | |
|---|---|
| 🏛️ **University** | Islamic University of Gaza (IUG) |
| 🏢 **Faculty** | Faculty of Computer Science |
| 📘 **Course** | Advanced Java — Java 3 |
| 👩‍🏫 **Teaching Assistant** | Aya Nabil Alharazin |
| 🎯 **Level** | Second Year — Undergraduate |
| 📦 **This Repository Covers** | 1 Lecture + Lab 1 |

---

## Content Overview

This repository covers the full content of **Lab 1**, both of which address the core topics of Java Object-Oriented Programming:

| # | Topic |
|---|---|
| 01 | Java Overview |
| 02 | Class and Object |
| 03 | Encapsulation |
| 04 | Inheritance |
| 05 | Polymorphism |
| 06 | Abstract Class |
| 07 | Interfaces |
| 08 | Inner Classes |
| 09 | Static and Final |
| 10 | Packages |
| 11 | Exception Handling |
| 12 | Java IO Streams |
| 13 | Java Generics |

---

## Lecture — Java OOP Topics

The lecture covers all topics listed above. Each topic is explained with a clear definition, key concepts, rules, and real-world context. Below is a summary of what each topic addresses.

---

### 01 — Java Overview
An introduction to the Java programming language — what it is, how it works, and the environment it runs in. Covers the difference between JVM, JRE, and JDK, the compilation process from source code to execution.
---

### 02 — Class and Object
The foundational building blocks of OOP. Explains what a class is as a blueprint and what an object is as an instance. Covers fields, methods, constructors (default, parameterized), the `this` keyword.

---

### 03 — Encapsulation
The OOP principle of hiding internal data and controlling access through methods. getter and setter methods, and why encapsulation leads to safer and more maintainable code.

---

### 04 — Inheritance
Modeling IS-A relationships and reusing code from parent classes. Covers the `extends` and `super` keywords, single, multilevel, and hierarchical inheritance, method overriding, the `@Override` annotation, and why Java restricts multiple class inheritance.

---

### 05 — Polymorphism
Designing flexible code where one interface serves many forms. Covers compile-time polymorphism through method overloading, runtime polymorphism through method overriding, upcasting, and how the JVM uses dynamic dispatch to select the correct method at runtime.

---

### 06 — Abstract Class
Defining a partial blueprint that cannot be instantiated directly. Covers the `abstract` keyword, abstract methods (declared without a body), concrete methods (shared implementation), constructors in abstract classes, and when to choose an abstract class over a regular class.

---

### 07 — Interfaces
Defining contracts that classes agree to fulfill. Covers the `interface` and `implements` keywords, implementing multiple interfaces in a single class, functional interfaces, and a full comparison between interfaces and abstract classes.

---

### 08 — Inner Classes
Classes defined inside other classes for better encapsulation and design. Covers all four types — **Member Inner Class**, **Static Nested Class**, **Local Inner Class**, and **Anonymous Inner Class** — along with their differences, access rules, and common use cases.

---

### 09 — Static and Final

**Static** — members that belong to the class itself rather than any object. Covers static variables (shared across all instances), static methods (cannot be overridden), static blocks (run once on class load), and static nested classes.

**Final** — members that cannot be changed. Covers final variables (assigned once), final methods (cannot be overridden), final classes (cannot be subclassed), final parameters, blank final variables, and the `public static final` constant pattern.

---

### 10 — Packages
Organizing Java classes into logical namespaces. Covers the `package` declaration, `import` statements (specific and wildcard), static imports, built-in Java packages, creating a multi-package project structure, and naming conventions.

---

### 11 — Exception Handling
Writing programs that detect and recover from runtime errors gracefully. Covers the exception hierarchy (`Throwable` → `Error` / `Exception` → `RuntimeException`), checked vs unchecked exceptions, `try` / `catch` / `finally` blocks, `throw` and `throws`, multi-catch, try-with-resources (Java 7+), and creating custom exception classes.

---

### 12 — Java IO Streams
Reading and writing data between a program and files.

**Text Files (Character Streams):**
- `Scanner` — reads and parses text from the console or a file
- `PrintWriter` — writes formatted text to the console or a file

**Binary Files (Byte Streams):**
- `FileInputStream` / `FileOutputStream` — read and write raw bytes
- `DataInputStream` / `DataOutputStream` — read and write Java primitive types (`int`, `double`, `boolean`, `String`, etc.) in binary format

---

### 13 — Java Generics
Writing reusable, type-safe code that works with any data type. Covers generic classes, multiple type parameters, generic methods, bounded type parameters (`<T extends Number>`), and wildcards (`?`, `? extends`, `? super`).

---

## Lab 1 — Java OOP Practice

Lab 1 accompanies the lecture and gives students hands-on practice with all topics through guided coding exercises and examples.

### What Lab 1 Includes

- Annotated source code examples for each topic
- Step-by-step exercises that apply the concepts from the lecture
- Common mistake examples with corrections
- Practice problems for independent work

### Lab 1 Topics

Lab 1 follows the same 13-topic structure as the lecture — students write and run Java programs that demonstrate each concept in practice.

---


---

## Tools & Setup

### Install JDK
Download **JDK 17 (LTS)** from:
- [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
- [OpenJDK — Adoptium](https://adoptium.net/)

Verify installation:
```bash
java  -version
javac -version
```

### Recommended IDEs

| IDE | Notes |
|---|---|
| **IntelliJ IDEA Community** | Recommended — best Java support |
| **VS Code** + Java Extension Pack | Lightweight alternative |
| **Eclipse** | Traditional, widely used in universities |

---

## Academic Integrity

This repository is provided exclusively for **IUG students** of the Advanced Java (Java 3) course.

- ✅ Use the material to study, understand, and practice
- ✅ Reference Slide while preparing for exams and labs
- ✅ Run and modify examples to deepen your understanding
- ❌ Do not share lab solutions publicly

> All submitted work must reflect your **own individual effort** in accordance with IUG academic integrity policies.

---

## Contact

| | |
|---|---|
| 👩‍🏫 **Teaching Assistant** | Aya Nabil Alharazin |
| 🏛️ **University** | Islamic University of Gaza (IUG) |
| 🏢 **Faculty** | Faculty of Computer Science |
| 📘 **Course** | Advanced Java — Java 3 |

*For course-related questions, please reach out through the official IUG student portal or during scheduled office hours.*

---

<div align="center">

**Islamic University of Gaza — Faculty of Information Technology**

*Advanced Java (Java 3) | Teaching Assistant: Aya Nabil Alharazin - 2026*

⭐ *Star this repository to bookmark it for quick reference throughout the semester!*

</div>
