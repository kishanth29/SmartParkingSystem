# Smart Parking System

## Overview

Smart Parking System is a console-based Java application that simulates a simple parking management system.  
It demonstrates key **Object-Oriented Design Principles** and **Design Patterns**, including:

- **Factory Method Pattern**: Dynamically creates different vehicle types (Car, Bike, Truck).  
- **Singleton Pattern**: Ensures only one instance of the `ParkingSystem` manages all vehicles.  
- **Single Responsibility Principle (SRP)**: Each class has a clear, single responsibility.  

The system is designed to be maintainable, extensible, and easy to understand, making it ideal for demonstrating design patterns in practice.

---

## Features

1. **Park Vehicle**: Add Car, Bike, or Truck to the parking lot.  
2. **Remove Vehicle**: Calculate parking fee based on hours parked and remove the vehicle.  
3. **Display Available Slots**: Shows the number of free slots remaining.  
4. **Console-Based Menu**: Simple interactive menu for user input.  

---

## Technologies & Tools

- **Java** (version 8 or above)  
- **NetBeans IDE** (recommended)  
- **No external libraries required**  

---

## Project Structure

SmartParkingSystem/

            └── src/
            └── smartparking/
            ├── Vehicle.java
            ├── Car.java
            ├── Bike.java
            ├── Truck.java
            ├── VehicleFactory.java
            ├── ParkingSystem.java
            └── Main.java



---

## Design Patterns Used

### 1. Factory Method Pattern
- Centralizes creation of Vehicle objects.
- Client does not instantiate vehicles directly.
- Example: `VehicleFactory.createVehicle("car", "ABC123")`

### 2. Singleton Pattern
- Only one `ParkingSystem` instance exists.
- Ensures all parking actions are managed centrally.
- Example: `ParkingSystem parkingSystem = ParkingSystem.getInstance();`

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/yourusername/SmartParkingSystem.git


Sample Usage

===== Smart Parking System =====
1. Park Vehicle
2. Remove Vehicle
3. Show Available Slots
4. Exit
Select option: 1
Enter vehicle type (car/bike/truck): car
Enter plate number: ABC123
Vehicle parked successfully: ABC123
