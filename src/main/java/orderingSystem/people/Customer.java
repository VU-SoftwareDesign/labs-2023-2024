package main.java.orderingSystem.people;

import java.util.UUID;

public class Customer {

    private UUID customerID;
    private String name;
    private String address;

    public Customer() {
        this.customerID = UUID.randomUUID();
    }

    public void changeDetails(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void addDetails(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
