/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartparking;

/**
 *
 * @author Titan
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ParkingSystem parkingSystem = ParkingSystem.getInstance();

        while (true) {

            System.out.println("\n===== Smart Parking System =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Show Available Slots");
            System.out.println("4. Exit");
            System.out.print("Select option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle type (car/bike/truck): ");
                    String type = scanner.nextLine();

                    System.out.print("Enter plate number: ");
                    String plate = scanner.nextLine();

                    try {
                        Vehicle vehicle = VehicleFactory.createVehicle(type, plate);
                        parkingSystem.parkVehicle(vehicle);
                    } catch (Exception e) {
                        System.out.println("Invalid vehicle type!");
                    }
                    break;

                case 2:
                    System.out.print("Enter plate number: ");
                    String removePlate = scanner.nextLine();

                    System.out.print("Enter parked hours: ");
                    int hours = scanner.nextInt();

                    parkingSystem.removeVehicle(removePlate, hours);
                    break;

                case 3:
                    parkingSystem.displayAvailableSlots();
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}