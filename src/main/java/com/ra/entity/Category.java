package com.ra.entity;

public class Category {
    int categoryId;
    String categoryName;
    String description;
    int parentCategoryId;

    public Category() {
    }

    public Category(int categoryId, String categoryName, String description, int parentCategoryId) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.parentCategoryId = parentCategoryId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(int parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }
}
