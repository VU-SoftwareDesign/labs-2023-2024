package orderingSystem.orders;

import orderingSystem.people.Customer;
import orderingSystem.payment.Payment;
import orderingSystem.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Order {

    public enum Status {
        CREATED("Created"),
        OTW("On the way"),
        DELIVERED("Delivered");
    }

    private final UUID orderID;
    private Status status;
    private Customer customer;
    private LocalDate createdDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private LocalDate dispatchedDate;
    private Payment payment;

    public Order(LocalDate orderDate, LocalDate deliveryDate) {
        this.orderID = UUID.randomUUID();
        this.status = Status.CREATED;
        this.orderDate = orderDate;
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

    public Status getStatus() {
        return this.status;
    }

    public Status updateStatus() {}

    public void archiveOrder() {}

    public boolean finaliseOrder(String type) {}
}
