package main.java.orderingSystem.orders;

import main.java.orderingSystem.people.Customer;
import main.java.orderingSystem.payment.Payment;
import main.java.orderingSystem.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Order {

    public enum Status {
        CREATED,
        OTW,
        DELIVERED;
    }

    private final UUID orderID;
    private Status status;
    private Customer customer;
    private LocalDate createdDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private LocalDate dispatchedDate;
    private Payment payment;

    public Order() {
        this.orderID = UUID.randomUUID();
        this.status = Status.CREATED;
        this.createdDate = LocalDate.now();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void makeReceipt() {
        System.out.println("This is the receipt for order");
    }

    public void addToOrder(List<Product> products) {
        this.products.addAll(products);
    }

    public void addProduct(Product product, int amount) {
        this.products.add(product);
    }

    public Status getStatus() {
        return this.status;
    }

    public void updateStatus(Status status) {
        this.status = status;
    }

    public void archiveOrder() {}

    public boolean finaliseOrder(String type) {
        updateStatus(Status.OTW);
        dispatchedDate = LocalDate.now();
        return true;
    }

    public void markedDelivered() {
        updateStatus(Status.DELIVERED);
        this.deliveryDate = LocalDate.now();
    }
}
