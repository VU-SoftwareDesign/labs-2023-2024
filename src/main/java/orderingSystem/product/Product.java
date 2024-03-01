package orderingSystem.product;

import java.util.UUID;

public class Product {

    private UUID productID;
    private String productName;
    private float price;
    private int amountInStock;

    public Product(String name, float price, int amountInStock) {
        this.productName = name;
        this.price = price;
        this.amountInStock = amountInStock;
        this.productID = UUID.randomUUID();
    }

    public void autoRestock(Integer amountInStock) {
        if (inStock() == false) System.out.println("Request to provider for restocking");
    }

    public boolean inStock() {
        return this.amountInStock > 0;
    }
}
