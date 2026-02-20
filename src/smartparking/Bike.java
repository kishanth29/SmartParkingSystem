/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartparking;

/**
 *
 * @author Titan
 */

public class Bike extends Vehicle {

    public Bike(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public double calculateFee(int hours) {
        return hours * 20;
    }
}