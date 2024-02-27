package main.java.orderingSystem;

import main.java.orderingSystem.orders.Order;
import main.java.orderingSystem.people.Customer;
import main.java.orderingSystem.product.Product;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        List<Product> products = new ArrayList<>();
        order.addToOrder(products);

        Customer customer = new Customer();
        customer.addDetails("John", "Main Street 1");
        order.setCustomer(customer);
    }
}
