# 📐 Math Operations – Clean Architecture Implementation
---

## 📖 Overview

This project was developed to **perform basic mathematical operations** while serving as a **practical application of software architecture principles** and **good development practices**.  

The main objective is not just to implement addition, subtraction, multiplication, and division, but to do so in a **clean, extensible, and maintainable architecture** that can easily be scaled for more complex operations or business rules.

---

## 🏗 Architectural Approach

The project applies **Clean Architecture** principles to ensure separation of concerns, maintainability, and testability.

**Key architectural elements:**

- **Clean Architecture** – separates business rules from frameworks and delivery mechanisms.
- **Facade Pattern** – provides a unified interface to interact with the business logic, simplifying external calls.
- **Use Cases** – encapsulate the application-specific business rules.
- **Controller Layer** – handles input/output flow, delegating logic to use cases.
- **Modularization** – code is separated into well-defined modules:
  - **`lib`** → shared libraries and common utilities.
  - **`business`** → core business rules and use cases.
  - **`app`** → application layer with controllers and API endpoints.

---

## 📂 Project Structure

```plaintext
math-operations-clean-arch/
│
├── app/               # Application layer (controllers, input/output handling)
│
├── business/          # Business logic, use cases, domain entities
│
├── lib/               # Shared utilities and helpers
│
└── README.md

