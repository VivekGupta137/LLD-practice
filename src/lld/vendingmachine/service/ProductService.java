package lld.vendingmachine.service;

import lld.vendingmachine.entity.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    // singleton
    private List<ProductCategory> productCategories;
    private static ProductService instance;

    private ProductService() {
        // private constructor to prevent instantiation\
        productCategories = new ArrayList<>();
    }

    // Lazy initialization
    public static ProductService getInstance() {
        if(instance == null) {
            instance = new ProductService();
        }
        return instance;
    }

    public List<ProductCategory> getProducts() {
        return productCategories;
    }

    public ProductCategory addProduct(ProductCategory productCategory) {
        productCategories.add(productCategory);
        return productCategory;
    }

    public ProductCategory reduceStock(ProductCategory productCategory, int quantity) {
        productCategory.reduceQuantity(quantity);
        return productCategory;
    }



}
