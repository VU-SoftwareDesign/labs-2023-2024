package main.java.orderingSystem;

import main.java.orderingSystem.orders.Order;
import main.java.orderingSystem.payment.Card;
import main.java.orderingSystem.payment.Payment;
import main.java.orderingSystem.people.Customer;
import main.java.orderingSystem.product.Product;
import main.java.orderingSystem.payment.Cash;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        List<Product> products = new ArrayList<>();
        order.addToOrder(products);

        Customer customer = new Customer();
        customer.addDetails("John", "Main Street 1");
        order.setCustomer(customer);

        order.finaliseOrder();
        // Terminal input for type of payment
        Payment payment = new Cash();

        if (payment instanceof Card) {
            payment.makePayment(order.calculatePrice());
        }
        else if (payment instanceof Cash) {
            // Terminal input for amount of cash garnered
            float change = payment.makePayment(order.calculatePrice());
            System.out.println(change);
        }

        order.makeReceipt();
    }
}
