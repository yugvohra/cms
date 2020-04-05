package com.geekspring.cms.domain;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private final String name;
    private final ProductType productType;
    private final Integer id;
    private final Category category;
    private final Float height;
    private final Float Length;
    private final Float Breadth;

    private final List<String> tags = new ArrayList<>();

    private Product(String name, ProductType productType, Integer id, Category category, Float height, Float length, Float breadth) {
        this.name = name;
        this.productType = productType;
        this.id = id;
        this.category = category;
        this.height = height;
        Length = length;
        Breadth = breadth;
    }

    public List<String> getTags() {
        return tags;

    }

    public static class ProductBuilder {
        private String name;
        private ProductType productType;
        private Integer id;
        private Category category;
        private Float height;
        private Float length;
        private Float breadth;

        public ProductBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder WithProductType(ProductType productType) {
            this.productType = productType;
            return this;
        }

        public ProductBuilder WithId(Integer id) {
            this.id = id;
            return this;
        }

        public ProductBuilder WithCategory(Category category) {
            this.category = category;
            return this;
        }

        public ProductBuilder withDimensions(Float length, Float height, Float breadth) {
            this.height = height;
            this.length = length;
            this.breadth = breadth;
            return this;
        }

        public Product build() {
            return new Product(name, productType, id, category, height, length, breadth);

        }

    }
}
