package com.mocavada.app.service.xml;

import com.mocavada.app.domain.xml.Cart;
import com.mocavada.app.domain.Customer;

import java.util.Map;

public interface CartService {
    Cart createCart(Customer customer, Map<String, Long> items);
    Cart createCart(String customerId, Map<String, Long> items);
    Cart addCart(String orderId);
    Cart deleteCart(String orderId);
    Cart updateCart(String orderId);
    void testCart();
}
