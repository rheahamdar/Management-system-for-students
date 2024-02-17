package com.managment.demo.entity;

import java.time.DayOfWeek;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long crn;

    @Column(name = "dep_name",nullable = false)
    private String depName;

    @Column(name = "course_num",nullable = false)
    private String courseNum;

    @Column(name = "course_credit",nullable = false)
    private int courseCredit;


    @Column(name = "time",nullable = false)
    private LocalTime time;

    @Enumerated(EnumType.STRING)
    @Column(name = "day")
    private DayOfWeek day;



    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public int getCourse_credit() {
        return courseCredit;
    }

    public void setCourse_credit(int course_credit) {
        this.courseCredit = course_credit;
    }

    public Course(){
        
    }

    public Course(long crn, String depName, String course_num, int course_credit, LocalTime time, DayOfWeek day) {
        this.depName = depName;
        this.courseNum = course_num;
        this.courseCredit = course_credit;
        this.time = time;
        this.day = day;
    }

   
    public long getCrn() {
        return crn;
    }

    public void setCrn(long crn) {
        this.crn = crn;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getCourse_num() {
        return courseNum;
    }

    public void setCourse_num(String course_num) {
        this.courseNum = course_num;
    }


    
}
