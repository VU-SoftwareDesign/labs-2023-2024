package main.java.orderingSystem.payment;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public abstract class Payment {

    private UUID paymentID;
    private float totalAmount;

    public void makePayment(float amount) {
        this.totalAmount -= amount;
        System.out.println("The payment is forwarded to payment system");
    }

    public Payment getPayment() {
        return this;
    }
}
