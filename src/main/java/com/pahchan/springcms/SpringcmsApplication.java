package com.pahchan.springcms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories
public class SpringcmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcmsApplication.class, args);
    }

}
