package org.example.factoryDesignPattern.vehicleExample;

public class Bike implements Vehicle {

    private String color;
    private String model;

    @Override
    public void drive() {
        System.out.printf("driving BIke");
    }

    public Bike(String color, String model) {
    }

    // ststic factoru method to create an object of class
    //usage in spring api -- sometimes we have two or more constructors of the data object (with id, withoud id) and so on
    //so using static factory methods with well chosen names would be good instead of haaving several constructors
    public static Bike createBike(String color, String model) {
        //there also can be written some type of logic
        return new Bike(color, model);
    }

    public static Boolean isRed(Bike bike) {
        return bike.color == "red";
    }
}
