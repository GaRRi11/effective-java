package org.example.factoryDesignPattern.dbExample;

public class DatabaseConnection {

    private static DatabaseConnection getInstance;

    //private constructor to prevent external instantion

    private DatabaseConnection() {
        //code of initializing the connection to db
    }

    //that method returns the cached one instead of creating new instance everytime
    public static DatabaseConnection getInstance(){
        if (getInstance == null){
            getInstance = new DatabaseConnection();
        }
        return getInstance;
    }

    public void connect(){
        System.out.printf("connecting to database...");
    }
}
