package com.kon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * SpringBoot Launcher
 *
 * @author kon, created on 2023/12/28T13:11.
 * @version 1.0.16
 */
@EnableJpaRepositories
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
