package com.springrest.springrest.courses;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	public CourseServiceImpl() {
		
		
		}

	@Override
	public List<Course> getCourses() {
	
		return courseDao.findAll();
	}
	
	//Parameterised Constructor for mock repo Testing..
	public CourseServiceImpl(CourseDao courseDao) {
		this.courseDao = courseDao;
		
		
	}

	@Override
	public Course getCourse(long courseId) {
		
	   return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		
		courseDao.save(course);
		
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		courseDao.save(course);
		return course;
	}


	@Override
	public Course deleteCourse(long parseLong) {
		
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		return entity;
	}
	
	
}
