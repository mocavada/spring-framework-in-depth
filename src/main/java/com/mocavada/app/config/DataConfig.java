package com.mocavada.app.config;

import com.mocavada.app.data.repository.CustomerRepository;
import com.mocavada.app.data.repository.InventoryItemRepository;
import com.mocavada.app.data.repository.SalesOrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {

    @Bean
    public InventoryItemRepository inventoryItemRepository() {
        return new InventoryItemRepository();
    }

    @Bean
    public CustomerRepository customerRepository() {
        return new CustomerRepository();
    }

    @Bean
    public SalesOrderRepository salesOrderRepository() {
        return new SalesOrderRepository();
    }

}
