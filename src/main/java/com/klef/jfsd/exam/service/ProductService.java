package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "https://fakestoreapi.com/products";

    public List<Product> getAllProducts() {
        Product[] products = restTemplate.getForObject(apiUrl, Product[].class);
        return Arrays.asList(products != null ? products : new Product[0]);
    }
}
