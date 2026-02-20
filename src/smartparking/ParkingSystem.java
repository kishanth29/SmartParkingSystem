/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartparking;

/**
 *
 * @author Titan
 */


import java.util.ArrayList;
import java.util.List;

public class ParkingSystem {

    private static ParkingSystem instance;

    private List<Vehicle> parkedVehicles;
    private final int totalSlots = 10;

    private ParkingSystem() {
        parkedVehicles = new ArrayList<>();
    }

    public static ParkingSystem getInstance() {

        if (instance == null) {
            instance = new ParkingSystem();
        }

        return instance;
    }

    public boolean parkVehicle(Vehicle vehicle) {

        if (parkedVehicles.size() < totalSlots) {
            parkedVehicles.add(vehicle);
            System.out.println("Vehicle parked successfully: " + vehicle.getPlateNumber());
            return true;
        } else {
            System.out.println("Parking is full!");
            return false;
        }
    }

    public void removeVehicle(String plateNumber, int hours) {

        Vehicle found = null;

        for (Vehicle v : parkedVehicles) {
            if (v.getPlateNumber().equalsIgnoreCase(plateNumber)) {
                found = v;
                break;
            }
        }

        if (found != null) {
            double fee = found.calculateFee(hours);
            parkedVehicles.remove(found);

            System.out.println("Vehicle removed: " + plateNumber);
            System.out.println("Parking Fee: Rs. " + fee);

        } else {
            System.out.println("Vehicle not found!");
        }
    }

    public void displayAvailableSlots() {
        System.out.println("Available Slots: " + (totalSlots - parkedVehicles.size()));
    }
}