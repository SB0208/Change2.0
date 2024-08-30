package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {

    Map<Integer, Order> orders = new HashMap<>();


    @Override
    public List<Order> getAllOrders() {
        return List.of();
    }

    @Override
    public Order getOrderById(int id) {
        return null;
    }

    @Override
    public void deleteOrderById(int id) {

    }

    @Override
    public void addOrder(Order order) {

    }


}
