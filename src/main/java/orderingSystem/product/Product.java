package orderingSystem.product;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class Product {
    @Setter @Getter
    private UUID productID;
    @Setter @Getter
    private String productName;
    @Setter @Getter
    private float price;
    @Setter @Getter
    private boolean isInStock;
    @Setter @Getter
    private Integer amountInStock;

    public Product(String name, float price, Integer amountInStock) {
        this.productName = name;
        this.price = price;
        this.amountInStock = amountInStock;
        this.productID = UUID.randomUUID();
        this.isInStock = true;
    }

    public void autoRestock(Integer amountInStock) {
            System.out.println("Request to provider for restocking");
        }
   }
