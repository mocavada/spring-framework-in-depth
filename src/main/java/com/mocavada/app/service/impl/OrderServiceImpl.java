package com.mocavada.app.service.impl;

import com.mocavada.app.data.repository.CustomerRepository;
import com.mocavada.app.data.repository.SalesOrderRepository;
import com.mocavada.app.domain.Customer;
import com.mocavada.app.domain.Order;
import com.mocavada.app.service.InventoryService;
import com.mocavada.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    private final InventoryService inventoryService;
    private final CustomerRepository customerRepository;
    private final SalesOrderRepository salesOrderRepository;

    @Autowired
    public OrderServiceImpl(InventoryService inventoryService, CustomerRepository customerRepository, SalesOrderRepository salesOrderRepository) {
        this.inventoryService = inventoryService;
        this.customerRepository = customerRepository;
        this.salesOrderRepository = salesOrderRepository;
    }


    @Override
    public Order createOrder(Customer customer, Map<String, Long> items) {
        return null;
    }

    @Override
    public Order createOrder(String customerId, Map<String, Long> items) {
        return null;
    }

    @Override
    public Order getOrder(String orderId) {
        return null;
    }
}
