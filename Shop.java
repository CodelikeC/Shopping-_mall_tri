import java.util.ArrayList; 
import java.util.List;

import transaction.Product;
public class Shop 
{
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) 
    {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product searchProduct(String name) 
    {
        for (Product product : products) 
        {
            if (product.getName().equalsIgnoreCase(name)) 
            {
                return product;
            }
        }
        return null;
    }
}
