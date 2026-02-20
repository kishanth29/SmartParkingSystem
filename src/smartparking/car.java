/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartparking;

/**
 *
 * @author Titan
 */

public class Car extends Vehicle {

    public Car(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public double calculateFee(int hours) {
        return hours * 50;
    }
}