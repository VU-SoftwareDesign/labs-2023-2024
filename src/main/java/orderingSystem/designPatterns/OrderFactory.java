package designPatterns;
import java.util.HashMap;
import java.util.Map;

import main.java.orderingSystem.orders.Order;

import java.util.UUID;

public class OrderFactory {

    private Map<UUID, Order> orderCache;

    private OrderFactory() {
        orderCache = new HashMap<>();
    }

    public Order createOrder() {
        for (Order order : orderCache.values()) {
            if (order != null) {
                return order; 
            }
        }
        
        Order order = new Order();
        orderCache.put(order.getOrderID(), order);
        return order;
    }
}

