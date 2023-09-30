package org.etiya;

import org.etiya.business.CourseManager;
import org.etiya.core.logging.FileLogger;
import org.etiya.core.logging.Logger;
import org.etiya.dataAccess.JdcCourseDao;
import org.etiya.entities.Course;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Course course = new Course(1, "C#", 12);
        List<Logger> loggers = (List<Logger>) new FileLogger();
        CourseManager courseManager = new CourseManager(new JdcCourseDao(), loggers);
        courseManager.add(course);
    }
}