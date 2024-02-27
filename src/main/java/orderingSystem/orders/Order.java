package main.java.orderingSystem.orders;

import main.java.orderingSystem.people.Customer;
import main.java.orderingSystem.payment.Payment;
import main.java.orderingSystem.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
        for (Product product : products) {
            if (product.inStock()) {
                addProduct(product);
            } else {
                System.out.println("OUT OF STOCK!");
            }
        }
    }

    public void addProduct(Product product) {
        this.products.add(product);
        product.setAmountInStock(product.getAmountInStock() - 1);
    }

    public List<Product> getProducts() {
        List<Product> returnable = new ArrayList<>();
        this.products.forEach(product -> returnable.add(new Product(product)));
        return returnable;
    }

    public Status getStatus() {
        return this.status;
    }

    public void updateStatus(Status status) {
        this.status = status;
    }

    public boolean finaliseOrder() {
        // UI input for cash or card and amount
        float amount = 0; // would be the input
        updateStatus(Status.OTW);
        dispatchedDate = LocalDate.now();
        payment.makePayment(amount);
        return true;
    }

    public void markedDelivered() {
        updateStatus(Status.DELIVERED);
        this.deliveryDate = LocalDate.now();
    }
}
