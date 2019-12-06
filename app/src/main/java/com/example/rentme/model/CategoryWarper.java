package com.example.rentme.model;


import java.io.Serializable;
import java.util.List;

public class CategoryWarper implements Serializable {
    private String categoryName;
    private List<Product> prodcuts;

    public CategoryWarper(String categoryName, List<Product> products) {
        this.categoryName = categoryName;
        this.prodcuts = products;
    }
    public String getCategoryName() { return this.categoryName; }
    public List<Product> getProdcuts() { return this.prodcuts; }
    public int getNumberOfProducts() { return this.prodcuts.size(); }
}
