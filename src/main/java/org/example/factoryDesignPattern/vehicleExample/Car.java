package org.example.factoryDesignPattern.vehicleExample;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.printf("drive car");
    }
}
