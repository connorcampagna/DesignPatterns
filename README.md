# Design Patterns

A Java implementation of common Design Patterns for learning purposes.

## Patterns Included

### 1. **Factory Pattern**
- **Location:** `src/FactoryPattern/`
- **Purpose:** Creates objects without specifying their exact classes
- **Classes:** 
  - `Pizza` (interface)
  - `CheesePizza`, `PineapplePizza` (concrete products)
  - `PizzaFactory` (factory)
  - `PizzaStore` (client)

### 2. **Observer Pattern**
- **Location:** `src/ObserverPattern/`
- **Purpose:** Establishes a one-to-many relationship where multiple observers are notified of state changes
- **Classes:**
  - `Subject` (interface)
  - `Observer` (interface)
  - `WeatherStation` (concrete subject)
  - `PhoneDisplay`, `WindowDisplay` (concrete observers)

### 3. **Strategy Pattern**
- **Location:** `src/StrategyPattern/`
- **Purpose:** Defines a family of algorithms and makes them interchangeable
- **Classes:**
  - `PaymentStrategy` (interface)
  - `CreditCard`, `PayPal` (concrete strategies)
  - `ShoppingCart` (context)

### 4. **Singleton Pattern**
- **Location:** `src/Singleton/`
- **Purpose:** Ensures a class has only one instance
- **Classes:**
  - `DatabaseConnection` (singleton)

## How to Run

1. Compile all Java files:
```bash
javac src/**/*.java
```

2. Run the main entry point:
```bash
java Main
```

## Project Structure

```
DesignPatterns/
├── src/
│   ├── FactoryPattern/
│   ├── ObserverPattern/
│   ├── StrategyPattern/
│   ├── Singleton/
│   └── Main.java
├── README.md
└── DesignPatterns.iml
```

## Learning Resources

- [Refactoring Guru - Design Patterns](https://refactoring.guru/design-patterns)
- [Oracle Java Documentation](https://docs.oracle.com/javase/)

## License

This project is for educational purposes.

