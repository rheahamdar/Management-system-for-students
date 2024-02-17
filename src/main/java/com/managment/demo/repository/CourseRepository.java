package com.managment.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.managment.demo.entity.Course;


public interface CourseRepository extends JpaRepository<Course,Long>{

    
}