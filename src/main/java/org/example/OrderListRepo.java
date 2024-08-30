package org.example;

import java.util.ArrayList;
import java.util.List;

   public class OrderListRepo {
       private List<Order> orders;

       public OrderListRepo() {
           this.orders = new ArrayList<>();

       }

      public void addOrder(Order order) {
           orders.add(order);
      }

      public boolean removeOrder(int order) {
           for (int i = 0; i < orders.size(); i++) {
               if (orders.get(i).getId() == order) {
                   orders.remove(i);
               }
           }
           return true;
      }






     public Order getOrder(int id) {
           for (Order order : orders) {
               if (order.getId() == id) {
                   return order;
               }
           }
           return null;
     }


     public List<Order> getAllOrders() {
           return orders;
     }







   }
