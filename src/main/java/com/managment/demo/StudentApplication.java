package com.managment.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import com.managment.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		if (studentRepository.count() == 0){
			Student student1 = new Student("Rhea","Hamdar","rhea.hamdar@hotmail.com");
			studentRepository.save(student1);

			Student student2 = new Student("Rouba","Hamdar","rouba.hamdar@hotmail.com");
			studentRepository.save(student2);

			Student student3 = new Student("Ralph","Hamdar","ralph.hamdar@hotmail.com");
			studentRepository.save(student3);

			Student student4 = new Student("Vera","Hamdar","vera.hamdar@hotmail.com");
			studentRepository.save(student4);
		*/
		}
		
}

