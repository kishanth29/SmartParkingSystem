/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartparking;

/**
 *
 * @author Titan
 */
public abstract class Vehicle {

    protected String plateNumber;

    public Vehicle(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public abstract double calculateFee(int hours);
}