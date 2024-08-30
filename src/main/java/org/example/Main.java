package org.example;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        ProductRepo repo = new ProductRepo();

        // Produkte hinzufügen
        repo.addProduct(new Product(1,"PC", 599.99 ));
        repo.addProduct(new Product(2, "TV", 399.99));

        // Einzelnes Produkt abrufen
        Product product = repo.getProduct(1);
        System.out.println("Abgerufenes Produkt: " + product);

        // Alle Produkte abrufen
        System.out.println("All Products: " + repo.getAllProducts());

        // Produkt entfernen
        repo.removeProduct(1);
        System.out.println("After Deleting: " + repo.getAllProducts());


        OrderListRepo orders = new OrderListRepo();

        orders.addOrder(new Order(333,List.of(new Product(1,"PC", 599.99 ))));
        orders.addOrder(new Order(444,List.of(new Product(2, "TV", 399.99))));

        Order order = orders.getOrder(1);
        System.out.println("Abgerufenes Order: " + order);


        System.out.println("All Orders: " + orders.getAllOrders());

        orders.removeOrder(333);
        System.out.println("After Deleting: " + orders.getAllOrders());

    }








}
