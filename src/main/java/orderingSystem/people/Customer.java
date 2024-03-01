package orderingSystem.people;

import java.time.LocalDate;
import java.util.Optional;
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
