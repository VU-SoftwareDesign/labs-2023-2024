package designPatterns;
import main.java.orderingSystem.product.Product;
import java.util.Iterator;
import java.util.List;

public class OrderProductIterator implements Iterator<Product> {
    private List<Product> products;
    private int position;

    public OrderProductIterator(List<Product> products) {
        this.products = products;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < products.size();
    }

    @Override
    public Product next() {
        if (this.hasNext()) {
            return products.get(position++);
        }
        return null;
    }

    @Override
    public void remove() {
        products.remove(position - 1);
        position--;
    }
}
