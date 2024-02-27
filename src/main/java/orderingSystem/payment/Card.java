package main.java.orderingSystem.payment;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public class Card extends Payment {
 
    private String type;
    private int number;
    private LocalDate expiryDate;


    public Card(String type, Integer number, LocalDate expiryDate) {
        this.type = type;
        this. number = number;
        this.expiryDate = expiryDate;
    }

    @Override
    public float makePayment(float amount) {
        return amount;
    }
}
