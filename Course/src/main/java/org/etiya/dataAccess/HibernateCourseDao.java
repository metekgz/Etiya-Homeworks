package org.etiya.dataAccess;

import org.etiya.entities.Course;

public class HibernateCourseDao implements CourseDao {
    public void add(Course course) {
        System.out.println("Hibernate worked");
    }
}
