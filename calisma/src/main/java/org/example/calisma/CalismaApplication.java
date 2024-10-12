package org.example.calisma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CalismaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalismaApplication.class, args);
        ApplicationContext context = SpringApplication.run("Lazy.class".getClass());
    }

}
