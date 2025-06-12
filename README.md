# Chain Of Responsibility Demo

A Java-based customer support system implementing the **Chain of Responsibility** design pattern to handle various support requests like billing, technical issues, and general inquiries. This project demonstrates object-oriented design and software engineering principles in action.

---

## Features

* Implements Chain of Responsibility design pattern
* Modular handler classes for different support types
* Easy to extend with new support categories
* Clean and readable OOP-based code structure
* Console interaction for testing various scenarios

---

## Requirements

* Java 8 or higher
* A Java IDE (e.g., IntelliJ, Eclipse) or terminal for compiling/running

---

## Installation

```bash
# Clone the repository
git clone https://github.com/yourusername/strategy-support-system.git

# Navigate into the project directory
cd strategy-support-system

# Compile the project
javac *.java

# Run the main class
java Main
```

---

## Project Structure

```plaintext
strategy-support-system/
├── Main.java                       # Entry point of the application
├── StrategyHandler.java           # Abstract base handler class
├── BillingHandler.java            # Handles billing-related support
├── TechnicalSupportHandler.java   # Handles technical support
├── GeneralSupportHandler.java     # Handles general queries
├── SupportHandler.java            # Manages the chain configuration
```

---

##  Usage

1. Run the `Main` class.
2. Enter a request such as:

   * "billing issue"
   * "need help with login"
   * "technical problem with app"
3. The request is passed through the chain until a suitable handler responds.

---

## Future Enhancements

* GUI-based interface using JavaFX or Swing
* Logging system to save requests and responses
* Add NLP to automatically classify requests more intelligently
* Support for multiple languages

---


