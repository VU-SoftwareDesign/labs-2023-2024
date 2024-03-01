package main.java.orderingSystem;

import main.java.orderingSystem.product.Product;

public interface ProductIterator {
    boolean hasNext();
    Product next();
}

