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

        private final String name;

        Status(String name) {
            this.name = name;
        }

        public String toString(){return this.name;}

    }

    private final UUID orderID;
    private Order.Status status;
    private Customer customer;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private LocalDate dispatchedDate;
    private Payment payment;

    public Order(Status status, LocalDate orderDate, LocalDate deliveryDate) {
        this.orderID = UUID.randomUUID();
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
     
    }

    public Order(Order order) {
        this.orderID = order.getOrderID();
        this.status = order.getStatus();
        this.orderDate = order.getOrderDate();
        this.deliveryDate = order.getDeliveryDate();
        this.payment = payment.getPayment();
        this.products = order.getProducts();
        this.dispatchedDate = order.getDispatchedDate();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void makeRecieipt(UUID orderID, Payment payment ) {
        System.out.println("This is the receipt for order");
    }

    public void addToOrder(List<Product> orderedProducts) {
        this.products = new ArrayList<>(orderedProducts);
    }

    public UUID getOrderID() {
        return this.orderID;
    }

    public Order.Status getStatus() {
        return this.status;
    }

    public LocalDate getOrderDate() {
        return this.orderDate;
    }

    public LocalDate getDeliveryDate() {
        return this.deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getDispatchedDate() {
        return dispatchedDate;
    }
}
