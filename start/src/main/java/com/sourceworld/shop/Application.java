package com.sourceworld.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Spring Boot Starter
 *
 * @author Frank Zhang
 */
@SpringBootApplication(scanBasePackages = {"com.sourceworld.shop", "com.alibaba.cola"}, exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class Application {

    public static void main(String[] args) throws InterruptedException {
//        SpringApplication.run(Application.class, args);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        while (true) {
            String userName = applicationContext.getEnvironment().getProperty("user.name");
            String userAge = applicationContext.getEnvironment().getProperty("user.age");
            String currentEnv = applicationContext.getEnvironment().getProperty("current.env");
            System.err.println("in " + currentEnv + " enviroment; " + "user name :" + userName + "; age: " + userAge);
            TimeUnit.SECONDS.sleep(3);
        }
    }
}
