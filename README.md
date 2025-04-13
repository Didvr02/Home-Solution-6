# Tech Support & Smart Home Remote - Java Design Patterns

This repository contains Java implementations of two behavioral design patterns: Chain of Responsibility and Command.

## Part 1: Chain of Responsibility - Tech Support Request Handler

### Overview

This part demonstrates the Chain of Responsibility pattern by simulating a tech support system. User issues are passed through a chain of support levels, where each level decides whether to handle the issue or pass it to the next handler.

### Files

* `Logger.java`: A simple logger class for tracking actions.
* `SupportHandler.java`: An abstract class defining the interface for all support handlers.
* `FAQBotHandler.java`: Handles simple issues like password resets.
* `JuniorSupportHandler.java`: Handles intermediate issues like refund requests and billing issues.
* `SeniorSupportHandler.java`: Handles complex issues like account bans and data loss.
* `Main.java`: Contains the client code that sets up the chain and tests it with various issues.

### How it Works

1.  **Handlers:** Each handler (`FAQBotHandler`, `JuniorSupportHandler`, `SeniorSupportHandler`) extends `SupportHandler` and implements the `handle()` method.
2.  **Chain Setup:** The chain is created by linking handlers together using the `setNext()` method.
3.  **Issue Handling:** When an issue is submitted, it's passed to the first handler in the chain. Each handler checks if it can handle the issue. If it can, it processes it; otherwise, it passes it to the next handler.
4.  **Logging:** The `Logger` class tracks which handler handles each issue.
5.  **Escalation:** If no handler can process an issue, it's escalated for manual handling.

### Usage

1.  Compile the Java files.
2.  Run `Main.java`.
3.  Observe the output showing how different issues are handled by the chain.

## Part 2: Command Pattern - Smart Home Remote Control

### Overview

This part demonstrates the Command pattern by simulating a smart home remote control. The remote can execute commands for devices like lights and thermostats, and it supports undo operations.

### Files

* `Command.java`: An interface defining the `execute()` and `undo()` methods.
* `Light.java`: Represents a light device.
* `Thermostat.java`: Represents a thermostat device.
* `TurnOnLightCommand.java`: A command to turn on a light.
* `SetThermostatCommand.java`: A command to set the thermostat temperature.
* `SmartHomeRemoteControl.java`: The invoker that stores and executes commands.
* `Main.java`: Contains the client code that sets up the remote and executes commands.

### How it Works

1.  **Commands:** Commands are objects that encapsulate actions. They implement the `Command` interface.
2.  **Receivers:** Receivers (`Light`, `Thermostat`) are objects that perform the actual actions.
3.  **Invoker:** The `SmartHomeRemoteControl` stores commands in slots and executes them when buttons are pressed.
4.  **Undo:** The remote maintains a history of executed commands, allowing for undo operations.
5.  **Command Mapping:** Commands are mapped to buttons (slots) on the remote.

### Usage

1.  Compile the Java files.
2.  Run `Main.java`.
3.  Observe the output showing the execution and undoing of commands.

### Bonus Features (Not Implemented Here, But Possible)

* **Macro Commands:** Combine multiple commands into a single command (e.g., "Goodnight mode").
* **Redo Functionality:** Implement a redo operation to reverse undo actions.
* **CLI Menu:** Create a command-line interface for interacting with the remote.

### Design Patterns Used

* **Chain of Responsibility:** For handling tech support requests.
* **Command:** For controlling smart home devices.


