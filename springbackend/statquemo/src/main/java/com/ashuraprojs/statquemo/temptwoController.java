package com.ashuraprojs.statquemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.security.web.csrf.CsrfToken;

import java.util.ArrayList;

import com.ashuraprojs.statquemo.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class temptwoController {

	private List<Student> students = new ArrayList<>(List.of(
			new Student(1, "Navin", 60),
			new Student(2, "Kiran", 65)));

	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}

	@PostMapping("/students")
	public Student addStudent(@RequestBody Student stud) {
		students.add(stud);
		return stud;
	}

	@GetMapping("/temp")
	public String getTemp() {
		return "Hi from server";
	}

	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}

}
