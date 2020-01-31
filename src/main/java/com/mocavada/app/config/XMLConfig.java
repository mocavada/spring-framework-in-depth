package com.mocavada.app.config;


import com.mocavada.app.service.xml.CartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfig {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-config.xml");

        CartService cartService = context.getBean(CartService.class);
        cartService.testCart();

    }
}
