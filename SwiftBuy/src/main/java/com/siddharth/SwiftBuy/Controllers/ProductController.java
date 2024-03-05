package com.siddharth.SwiftBuy.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
    @GetMapping("/api/products")
    public ResponseEntity<List<String>> getAllProducts() {
        List<String> products = Arrays.asList("Product 1", "Product 2", "Product 3");
        return ResponseEntity.ok(products);
    }
    @GetMapping("/api/productName")
    public String getProduct(){
        return "my product";
    }
}
