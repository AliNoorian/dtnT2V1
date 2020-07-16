package com.dotin.dtntask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DotinApplication {

    public static void main(String[] args) {
        SpringApplication.run(DotinApplication.class, args);
    }

}
