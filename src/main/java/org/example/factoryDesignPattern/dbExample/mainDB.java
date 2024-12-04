package org.example.factoryDesignPattern.dbExample;

public class mainDB {
    public static void main(String[] args) {

        //use the factory method to get the single instance of DatabseConnection
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.connect();

        //Demonstrate that only one instance is cratedd
        DatabaseConnection anotherConnection = DatabaseConnection.getInstance();
        System.out.println(connection == anotherConnection); //true
    }
}
