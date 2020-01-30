package com.mocavada.app.service;

import com.mocavada.app.domain.Customer;
import com.mocavada.app.domain.Order;

import java.util.Map;

public interface OrderService {
    Order createOrder(Customer customer, Map<String, Long> items);
    Order createOrder(String customerId, Map<String, Long> items);
    Order getOrder(String orderId);
}
