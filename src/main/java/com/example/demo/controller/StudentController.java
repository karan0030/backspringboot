package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFound;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")

public class StudentController {
	
	@Autowired
	private StudentRepo studentrepo;
	
	// get all students
		@GetMapping("/students")
		public List<Student> getAllStudents(){
			return studentrepo.findAll();
		}		
		
		// create Student rest api
		@PostMapping("/students")
		public Student createStudent(@RequestBody Student Student) {
			return studentrepo.save(Student);
		}
		
		// get Student by id rest api
		@GetMapping("/students/{id}")
		public ResponseEntity<Student> getStudentById(@PathVariable String id) {
			Student Student = studentrepo.findById(id)
					.orElseThrow(() -> new ResourceNotFound("Student not exist with id :" + id));
			return ResponseEntity.ok(Student);
		}
		
		
		
		// update Student rest api
		
		@PutMapping("/students/{id}")
		public ResponseEntity<Student> updateStudent(@PathVariable String id, @RequestBody Student StudentDetails){
			Student Student = studentrepo.findById(id)
					.orElseThrow(() -> new ResourceNotFound("Student not exist with id :" + id));
			
			Student.setStudent_name(StudentDetails.getStudent_name());
			Student.setAddress(StudentDetails.getAddress());
			Student.setCity(StudentDetails.getCity());
			Student.setClass_opt(StudentDetails.getClass_opt());
			Student.setDate(StudentDetails.getDate());
			Student.setDob(StudentDetails.getDob());
			Student.setEmail(StudentDetails.getEmail());
			Student.setDate(StudentDetails.getDate());
			Student.setFather_name(StudentDetails.getFather_name());
			Student.setMarks(StudentDetails.getMarks());
			
			
			Student updatedStudent = studentrepo.save(Student);
			return ResponseEntity.ok(updatedStudent);
		}
		
		// delete Student rest api
		@DeleteMapping("/students/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable String id){
			Student Student = studentrepo.findById(id)
					.orElseThrow(() -> new ResourceNotFound("Student not exist with id :" + id));
			
			studentrepo.delete(Student);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
	
	
	

}
