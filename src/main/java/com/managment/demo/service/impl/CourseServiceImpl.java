package com.managment.demo.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.managment.demo.entity.Course;
import com.managment.demo.repository.CourseRepository;
import com.managment.demo.service.CourseService;


@Service
public class CourseServiceImpl implements CourseService{

    CourseRepository courseRepository;
    

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseByCrn(Long crn) {
        return courseRepository.findById(crn).get();
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourseByCrn(Long crn) {
        courseRepository.deleteById(crn);
    }

    
    
    
}
