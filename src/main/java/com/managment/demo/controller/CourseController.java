package com.managment.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.managment.demo.entity.Course;
import com.managment.demo.service.CourseService;



@Controller
public class CourseController {
    
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    //method to handle list students request and retun mode and view
    @GetMapping("/courses")
    public String listCourses(Model model){
        model.addAttribute("courses", courseService.getAllCourses());
        return "courses";
    }

    @GetMapping("/courses/new")
    public String createCourseForm(Model model){
        Course course = new Course();
        model.addAttribute("course",course);
        return "create_course";
    }

    @PostMapping("/courses")
    public String saveStudent(@ModelAttribute("course") Course course){
        courseService.saveCourse(course);
        return "redirect:/courses";
    }

    @GetMapping("/courses/edit/{crn}")
    public String editStudentForm(@PathVariable Long crn,Model model){
        model.addAttribute("course",courseService.getCourseByCrn(crn));
        return "edit_course";
    }

    @PostMapping("/courses/{crn}")
    public String updateCourse(@PathVariable Long crn, @ModelAttribute("course") Course course, Model model){

        Course existingCourse = courseService.getCourseByCrn(crn);
        existingCourse.setCourse_num(course.getCourse_num());
        existingCourse.setDepName(course.getDepName());
        existingCourse.setCourse_credit(course.getCourse_credit());
        existingCourse.setTime(course.getTime());
        existingCourse.setDay(course.getDay());

        courseService.updateCourse(existingCourse);
        return "redirect:/courses";
    }

    @GetMapping("/courses/{crn}")  
    public String deleteString(@PathVariable Long crn){
        courseService.deleteCourseByCrn(crn);
        return "redirect:/courses";
    }
}