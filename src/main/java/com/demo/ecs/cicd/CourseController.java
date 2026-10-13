package com.demo.ecs.cicd;

import com.demo.ecs.cicd.entity.Course;
import com.demo.ecs.cicd.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/addcourse")
    public ResponseEntity<Course> addCourse(@RequestBody Course course){
            courseService.addCourse(course);

        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> addCourse(){
        List<Course> courseList = courseService.getCourses();

        return new ResponseEntity<>(courseList, HttpStatus.OK);
    }
}
