package com.managment.demo.service;
import java.util.List;

import com.managment.demo.entity.Course;


public interface CourseService {
    List<Course> getAllCourses();
    Course saveCourse(Course course);
    Course getCourseByCrn(Long crn);
    Course updateCourse(Course course);
    void deleteCourseByCrn(Long crn);
}
