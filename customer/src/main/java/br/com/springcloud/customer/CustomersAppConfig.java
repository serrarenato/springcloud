package br.com.springcloud.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomersAppConfig {
 
    public static void main(String[] args) {
        SpringApplication.run(CustomersAppConfig.class, args);
    }
 
}