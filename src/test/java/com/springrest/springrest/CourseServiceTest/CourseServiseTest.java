package com.springrest.springrest.CourseServiceTest;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.courses.CourseServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CourseServiseTest {
	
	@Mock
	private CourseDao courseDao;
	
	
	private CourseServiceImpl courseServiceImpl;
	
	@BeforeEach
	void setUp() {
		
		this.courseServiceImpl = new CourseServiceImpl(courseDao);
	}
	
	@Test
	void getCourses() {
		
		courseServiceImpl.getCourses();
		
		verify (courseDao).findAll();
		
	}

}
