package com.example.productservice.config;

import com.example.productservice.entity.Product;
import com.example.productservice.repository.ProducRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ProducRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        // Add sample products for testing
        productRepository.save(new Product("Laptop", new BigDecimal(999.99)));
        productRepository.save(new Product("Smartphone", new BigDecimal(699.99)));
        productRepository.save(new Product("Headphones", new BigDecimal(149.99)));
        productRepository.save(new Product("Keyboard", new BigDecimal(79.99)));
        productRepository.save(new Product("Mouse", new BigDecimal(29.99)));

        System.out.println("✅ Sample products initialized for testing!");
    }
}
