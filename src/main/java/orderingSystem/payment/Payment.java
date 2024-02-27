package main.java.orderingSystem.payment;

import java.util.UUID;

public abstract class Payment {

    private UUID paymentID;
    private float totalAmount;

    abstract public float makePayment(float amount);
    public Payment getPayment() {
        return this;
    }
}
