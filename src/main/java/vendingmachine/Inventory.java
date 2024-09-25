package vendingmachine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Inventory {

    private Set<Product> products;

    public Inventory(){
        this.products = new HashSet<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public boolean isAvailable(Product product){
       return products.contains(product);
    }

    public void updateQuantity(Product product,Integer quantity){
        product.setQuantity(quantity);
        products.add(product);
    }
}
