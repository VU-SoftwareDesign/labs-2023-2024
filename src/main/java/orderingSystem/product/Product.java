package main.java.orderingSystem.product;

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

    public Product(Product product) {
        this.productID = product.productID;
        this.productName = product.productName;
        this.price = product.price;
        this.amountInStock = product.amountInStock;
    }

    public void autoRestock(int n) {
        if (!inStock()) this.amountInStock += n;
    }

    public boolean inStock() {
        return this.amountInStock >= 5;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amount) {
        this.amountInStock = amount;
    }
}
