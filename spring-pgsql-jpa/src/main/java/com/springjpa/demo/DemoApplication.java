package com.springjpa.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.demo.student.Student;

@SpringBootApplication
@RestController()
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping()
	public List<Student> helloWorld() {
		return List.of(
			new Student(
				1L, 
				"Mamun",
				"imam@learnspring.boot", 
				LocalDate.of(2000, Month.APRIL, 5),
				21
			)
		);
	}
}
