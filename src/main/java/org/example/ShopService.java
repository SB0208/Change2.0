package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShopService {

   private ProductRepo productRepo;
   private OrderListRepo orderListRepo;

   public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
       this.productRepo = productRepo;
       this.orderListRepo = orderListRepo;

   }
   public void addNewOrder(Order order) {
       for (Product product : order.getProducts()) {
           if (!productRepo.getAllProducts().contains(product))
           {

               System.out.println("Product not available");

           }
       }
       orderListRepo.addOrder(order);

   }






}

