//package com.springrest.springrest.controllerTest;
//
//import static org.mockito.Mockito.verify;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.springrest.springrest.Dao.CourseDao;
//import com.springrest.springrest.controller.MyComtroller;
//import com.springrest.springrest.courses.CourseService;
//
//@ExtendWith(MockitoExtension.class)
//public class ControllerTest {
//	
//	@Mock
//	private CourseService courseService;
//	
//	@Autowired
//	private MyComtroller myComtroller;
//	
//	@BeforeEach
//	void setUp() {
//		this.myComtroller = new MyComtroller(courseService);
//	}
//	
//	@Test
//	void getCourses() {
//		
//		//myComtroller.getCourses();
//		
//		verify (courseService).getCourses();
//		
//	}
//
//}
