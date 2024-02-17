package com.managment.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.managment.demo.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Long>{

    
}
