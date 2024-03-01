package main.java.orderingSystem.payment;

import java.util.Objects;

public class Cash {
    private float amountGiven;

    public float makePayment(float amount, String type) {
         if (Objects.equals(type, "Cash")) {
             return amountGiven - amount;
         } else return 0;
    }
}
