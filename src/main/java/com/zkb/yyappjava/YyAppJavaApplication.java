package com.zkb.yyappjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class YyAppJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YyAppJavaApplication.class, args);
    }

}
