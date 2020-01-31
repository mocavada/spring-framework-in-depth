package com.mocavada.app.service.xml.impl;

import com.mocavada.app.data.repository.CustomerRepository;
import com.mocavada.app.data.repository.xml.WebOrderRepository;
import com.mocavada.app.domain.xml.Cart;
import com.mocavada.app.domain.Customer;
import com.mocavada.app.service.xml.BookService;
import com.mocavada.app.service.xml.CartService;

import java.util.Map;

public class CartServiceImpl implements CartService {

    private final BookService bookService;
    private final CustomerRepository customerRepository;
    private final WebOrderRepository webOrderRepository;

    public CartServiceImpl(BookService bookService, CustomerRepository customerRepository, WebOrderRepository webOrderRepository) {
        this.bookService = bookService;
        this.customerRepository = customerRepository;
        this.webOrderRepository = webOrderRepository;
    }

    @Override
    public Cart createCart(Customer customer, Map<String, Long> items) {
        return null;
    }

    @Override
    public Cart createCart(String customerId, Map<String, Long> items) {
        return null;
    }

    @Override
    public Cart addCart(String orderId) {
        return null;
    }

    @Override
    public Cart deleteCart(String orderId) {
        return null;
    }

    @Override
    public Cart updateCart(String orderId) {
        return null;
    }

    @Override
    public void testCart() {
        System.out.println("Cart is called!");
    }
}
