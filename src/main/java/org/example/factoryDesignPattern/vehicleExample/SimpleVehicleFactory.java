package org.example.factoryDesignPattern.vehicleExample;

public class SimpleVehicleFactory {

    // Simple Factory centralizes the creation of objects.
    // It is useful when you need to create objects based on input (like type).


    //create vehicle based on imput
    // Factory Method: Encapsulates creation logic.
    // Here, the factory hides the instantiation logic from the client.

    public static Vehicle createVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "truck" -> new Truck();
            case "bike" -> new Bike("","");
            default -> throw new IllegalArgumentException("Unknown vehicle type: " + type);
        };

    }

    /* Why this Factory is Useful:

          If a new vehicle type (e.g., "bus") is added, you only update the factory method.
          The client doesn’t deal with object creation directly; it only calls createVehicle().

    */


    //create a bike object via ststic factory method
    Bike bike = Bike.createBike("red", "green");

    public void redOrNot(){
        //used static factory method to check instance
        if (Bike.isRed(bike)){
            System.out.printf("yes");
        }
        else {
            System.out.printf("not");
        }
    }
}
