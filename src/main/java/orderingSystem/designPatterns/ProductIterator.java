package designPatterns;

import main.java.orderingSystem.product.Product;

public interface ProductIterator {
    boolean hasNext();
    Product next();
}

