package com.example.courseproject;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getCourseById(Long courseId);
    Course saveCourse(Course course);
    void deleteCourse(Long courseId);
}