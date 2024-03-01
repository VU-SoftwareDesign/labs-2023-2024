package designPatterns;
import java.util.HashMap;
import java.util.Map;

import main.java.orderingSystem.orders.Order;

import java.util.UUID;

public class OrderFactory {

    private static OrderFactory instance;
    private Map<UUID, Order> orderCache;

    private OrderFactory() {
        orderCache = new HashMap<>();
    }

    public static synchronized OrderFactory getInstance() {
        if (instance == null) {
            instance = new OrderFactory();
        }
        return instance;
    }

    public Order createOrder() {
        Order order = new Order();
        orderCache.put(order.getOrderID(), order);
        return order;
    }
}



