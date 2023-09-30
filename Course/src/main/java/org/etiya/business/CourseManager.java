package org.etiya.business;

import org.etiya.core.logging.Logger;
import org.etiya.dataAccess.CourseDao;
import org.etiya.dataAccess.JdcCourseDao;
import org.etiya.entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) {
        // business rules
        if (course.getPrice() < 0) {
            System.out.println("Kurs Fiyatı 0 dan büyük olmalıdır");
        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }
}
