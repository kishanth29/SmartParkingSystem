/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartparking;

/**
 *
 * @author Titan
 */

// Using Factory Method Pattern
public class VehicleFactory {

    public static Vehicle createVehicle(String type, String plateNumber) {

        switch (type.toLowerCase()) {

            case "car":
                return new Car(plateNumber);

            case "bike":
                return new Bike(plateNumber);

            case "truck":
                return new Truck(plateNumber);

            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}