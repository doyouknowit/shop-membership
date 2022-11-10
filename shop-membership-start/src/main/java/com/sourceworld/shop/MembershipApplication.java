package com.sourceworld.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Starter
 *
 * @author Frank Zhang
 */
@SpringBootApplication(scanBasePackages = {"com.sourceworld.shop", "com.alibaba.cola"})
public class MembershipApplication {

    public static void main(String[] args) {
        SpringApplication.run(MembershipApplication.class, args);
    }
}
