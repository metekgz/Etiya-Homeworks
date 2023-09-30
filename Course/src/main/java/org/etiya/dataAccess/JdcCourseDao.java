package org.etiya.dataAccess;

import org.etiya.entities.Course;

public class JdcCourseDao implements CourseDao {
    public void add(Course course) {
        System.out.println("JDBC worked");
    }
}
