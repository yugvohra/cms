package com.geekspring.cms.domain;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private final String name;
    private final CategoryType categoryType;
    private final Integer id;

    private List<Category> subCategories = new ArrayList();
    private List<String> tags = new ArrayList();

    public Category(String name, CategoryType categoryType, Integer id) {
        this.name = name;
        this.categoryType = categoryType;
        this.id = id;
    }
}
