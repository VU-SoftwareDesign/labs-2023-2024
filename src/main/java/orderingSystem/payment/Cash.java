package main.java.orderingSystem.payment;

public class Cash extends Payment{
    private float amountGiven;

    @Override
    public float makePayment(float amount) {
        return amountGiven - amount;
    }
}
