package br.com.springcloud.customer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
 
    @GetMapping
    public List<String> findAll() {
    	String a[]={
                "Customer 1",
                "Customer 2",
                "Customer 3",
                "Customer 4"};
        return Arrays.asList(a);
    }
}
