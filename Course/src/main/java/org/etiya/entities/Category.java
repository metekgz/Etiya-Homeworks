package org.etiya.entities;

public class Category {
    private int courseId;

    public Category() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category(int courseId, String categoryName) {
        this.courseId = courseId;
        this.categoryName = categoryName;
    }

    private String categoryName;
}
