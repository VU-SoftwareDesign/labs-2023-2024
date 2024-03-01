package main.java.orderingSystem.payment;

import java.util.UUID;

public class Payment {

    private Card card;
    private Cash cash;
    private String type;
    private UUID paymentID;
    private float totalAmount;

    public void makePayment(float amount, String paymentType) {
        card.makePayment(amount, paymentType);
        cash.makePayment(amount, paymentType);
    };
    public Payment getPayment() {
        return this;
    }
}
