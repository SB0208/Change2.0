package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> products;


    public ProductRepo() {
        this.products = new ArrayList<>();


    }

    //Product hinzufügen
    public void addProduct(Product product)
    {
        products.add(product);
    }

    //Product entfernen
    public boolean removeProduct(int id)
    {
        for (Product product : products) {
            if (product.getId() == id){
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    //Einzel Product abrufen
    public Product getProduct(int id)
    {
        for (Product product : products)
        {

            if (product.getId() == id) {
                return product;
            }
        }

        return null; //Product nicht gefunden
    }

    //Alle producte abrufen
    public List<org.example.Product> getAllProducts() {
        return products;
    }


}
