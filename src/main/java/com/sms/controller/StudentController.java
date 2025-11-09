package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student;
import com.sms.service.IStudentMgmtService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private IStudentMgmtService service;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable  Integer id) {
		return service.getStudent(id);
	}
	
	@GetMapping("/all")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable    Integer id) {
		service.deleteStudent(id);
		return "Student Deleted Succesfully";
	}
}
