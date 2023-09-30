package org.etiya.business;

import org.etiya.core.logging.Logger;
import org.etiya.dataAccess.CategoryDao;
import org.etiya.dataAccess.CourseDao;
import org.etiya.entities.Category;
import org.etiya.entities.Course;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        // business rules
        if (category.getCategoryName() == category.getCategoryName()) {
            throw new Exception("Can Not same Category");
        }
        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
}
