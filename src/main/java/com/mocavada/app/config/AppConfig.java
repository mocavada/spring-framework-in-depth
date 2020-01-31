package com.mocavada.app.config;

import com.mocavada.app.data.repository.CustomerRepository;
import com.mocavada.app.data.repository.InventoryItemRepository;
import com.mocavada.app.data.repository.SalesOrderRepository;
import com.mocavada.app.service.InventoryService;
import com.mocavada.app.service.OrderService;
import com.mocavada.app.service.impl.InventoryServiceImpl;
import com.mocavada.app.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@Import(DataConfig.class)
@PropertySource("classpath:/application-${spring.profiles.active}.properties")
public class AppConfig {

    @Value("${greeting.text}")
    private String greetingText;

    @Value("${greeting.preamble}")
    private String greetingPreamble;

    @Value("#{new Boolean(environment['spring.profiles.active']=='dev')}")
    private boolean isDev;
    
    public class Worker {
        private String text;
        private String preamble;

        public Worker(String preamble, String text) {
            this.preamble = preamble;
            this.text = text;
            System.out.println("New Instance");
        }

        public void execute() {
            System.out.println(preamble + " " + text + " is dev: " + isDev);
        }
    }

    @Bean
    @Scope("prototype")
    public Worker worker() {

        return new Worker(greetingPreamble,greetingText);
    }


    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private SalesOrderRepository salesOrderRepository;

    @Autowired
    private InventoryItemRepository inventoryItemRepository;

    @Bean
    public OrderService orderService(InventoryService inventoryService, CustomerRepository customerRepository, SalesOrderRepository salesOrderRepository) {
        return new OrderServiceImpl(inventoryService, customerRepository, salesOrderRepository);
    }

    @Bean
    public InventoryService inventoryService(InventoryItemRepository inventoryItemRepository) {
        return new InventoryServiceImpl(inventoryItemRepository);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        System.out.println(orderService==null? "NULL" : "A OK");

        Worker worker = context.getBean(Worker.class);
        worker.execute();
        Worker worker1 = context.getBean(Worker.class);
        worker1.execute();
    }
}
