package com.ishika.springrest.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ishika.springrest.entities.Course;

@Repository
public interface CourseService {

	public List<Course> getCourses();
}
