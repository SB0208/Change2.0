package org.example;

import java.util.List;

public interface OrderRepo {

    List<Order> getAllOrders();
    Order getOrderById(int id);
    void deleteOrderById(int id);
    void addOrder(Order order);


}
