package com.mocavada.app.config;


import com.mocavada.app.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:/application.properties")
@ComponentScan(basePackages = {"com.mocavada.app"})
public class AppConfig {

    @Value("${greeting.text}")
    private String greetingText;

    @Value("${greeting.preamble}")
    private String greetingPreamble;


    public class Worker {
        private String text;
        private String preamble;

        public Worker(String preamble, String text) {
            this.preamble = preamble;
            this.text = text;
            System.out.println("New Instance");
        }

        public void execute() {
            System.out.println(preamble + " " + text);
        }
    }

    @Bean
    public Worker worker() {
        return new Worker(greetingPreamble, greetingText);
    }


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Worker worker = context.getBean(Worker.class);
        worker.execute();
        OrderService orderService = context.getBean(OrderService.class);


    }
}
