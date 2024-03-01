import java.util.List;

import main.java.orderingSystem.orders.Order;
import main.java.orderingSystem.product.Product;


public class OrderDispatcher {
    private DistributorService service;
    public OrderDispatcher(DistributorService service) {
        this.service = service;
    }

    public Order packageOrder() {
        Order toPackage = new Order();
        toPackage.addToOrder(this.service.distribute());
        toPackage.updateStatus(Order.Status.CREATED);
        return toPackage;
    }
}

public interface DistributorService {
    public List<Product> distribute();
}

public class FoodDistributorService implements DistributorService {

    private List<Product> products = new List(
        new Product("Apple", 1, 5), 
        new Product("Orange", 2, 5), 
        new Product("Tomato", 3, 2)
    );

    private int lastItemSent = 0;

    @Override
    // Only send one
    public List<Product> distribute() {
        return new List(this.products.get(lastItemSent++ % this.products.size()));
    }
}

public class ElectronicsDistributorService implements DistributorService {
    private List<Product> products = new List(
        new Product("iPhone", 1000, 5), 
        new Product("Laptop", 500, 5), 
        new Product("TV", 3000, 2)
    );

    @Override
    // Always send everytthing
    public List<Product> distribute() {
        return this.products;
    }
}

FoodDistributorService foodService = new FoodDistributorService();
ElectronicsDistributorService electronicsService = new ElectronicsDistributorService();

OrderDispatcher foodDispatcher = new OrderDispatcher(foodService);
OrderDispatcher electronicDispatcher = new OrderDispatcher(electronicsService);

// Make food orders
foodDispatcher.packageOrder();

// Make electronic orders
electronicDispatcher.packageOrder();