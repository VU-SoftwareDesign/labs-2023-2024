package main.java.designPatterns

public class FlyweightProduct{

    public UUID productID;
    public String productName;
    public float price;
    public int amountInStock;
    public ProductCategory category;

    public FlyweightProduct(String name, float price, int amountInStock, ProductCategory category) {
        this.productName = name;
        this.price = price;
        this.amountInStock = amountInStock;
        this.productID = UUID.randomUUID();
        this.category = category;
    }

    public Product(Product product) {
        this.productID = product.productID;
        this.productName = product.productName;
        this.price = product.price;
        this.amountInStock = product.amountInStock;
        this.category = product.category;
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

    public float getPrice() { return this.price; }
}
