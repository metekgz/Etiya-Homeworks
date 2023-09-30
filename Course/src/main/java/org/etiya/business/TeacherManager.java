package org.etiya.business;

import org.etiya.core.logging.Logger;
import org.etiya.dataAccess.CourseDao;
import org.etiya.dataAccess.TeacherDao;
import org.etiya.entities.Course;
import org.etiya.entities.Teacher;

import java.util.List;

public class TeacherManager {
    private TeacherDao teacherDao;
    private List<Logger> loggers;

    public TeacherManager(TeacherDao teacherDao, List<Logger> loggers) {
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }

    public void add(Teacher teacher) {
        // business rules
        teacherDao.add(teacher);
    }
}
