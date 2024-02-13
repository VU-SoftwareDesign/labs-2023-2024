package orderingSystem.people;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public class Customer {

    private UUID customerID;
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.customerID = UUID.randomUUID();
        this.name = name;
        this.address = address;
    }

    public void changeAdress(String adress){
        this.address = address;
    }

}
