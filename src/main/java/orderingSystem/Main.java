package main.java.orderingSystem;

import main.java.orderingSystem.orders.Order;
import main.java.orderingSystem.payment.Card;
import main.java.orderingSystem.payment.Payment;
import main.java.orderingSystem.people.Customer;
import main.java.orderingSystem.product.Product;
import main.java.orderingSystem.payment.Cash;

import java.net.PasswordAuthentication;
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
        Payment payment = new Payment();
        payment.makePayment(order.calculatePrice(), "Card");


        order.makeReceipt();
    }
}
