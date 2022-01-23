package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.Dao.CustomerDao;
import com.springrest.springrest.courses.CourseService;
import com.springrest.springrest.dto.OrderRequest;
import com.springrest.springrest.dto.OrderResponse;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.entities.Customer;

@RestController
public class MyComtroller {
	
	@GetMapping("/home")
	public String home(){
		return"Welcome to the Courses Application.";
	}
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private CourseDao courseDao;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerDao.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrder")
	public List<Customer> findAllOrders(){
		return customerDao.findAll();
	}
	
	
	
//	@Autowired
//	private CourseService courseService;
	
//	//get the courses..
//	@GetMapping("/courses")
//	public List<Course> getCourses(){
//		return this.courseService.getCourses();
//	}
//	
//	//Parameterised Constructor for ControllerTest..
//	public MyComtroller(CourseService courseService) {
//	this.courseService = courseService;
//	}
//
//	//get the single course by id..(courseId)
//	@GetMapping("/courses/{courseId}")
//	public Course getCourse(@PathVariable String courseId ) {
//	return this.courseService.getCourse(Long.parseLong(courseId));
//	}
//	
//	//add the course..
//	@PostMapping("/courses")
//	public Course addCourse(@RequestBody Course course) {
//		return this.courseService.addCourse(course);	
//	}
//	
//	//update the courser..
//	@PutMapping("/courses")
//	public Course updateCourse(@RequestBody Course course) {
//		return this.courseService.updateCourse(course);	
//	}
//	
//	//Delete the Course..
//	@DeleteMapping("/courses/{courseId}")
//	public Course deleteCourse(@PathVariable String courseId) {
//		return this.courseService.deleteCourse(Long.parseLong(courseId));
//	}
}
