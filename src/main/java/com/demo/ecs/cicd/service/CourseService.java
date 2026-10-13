package com.demo.ecs.cicd.service;

import com.demo.ecs.cicd.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private List<Course> courses;

    public CourseService(){
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        if(course !=null){
            courses.add(course);
        }
    }

    public Course getCourse(String courseName){
       if(!courses.isEmpty()){
         return  courses.stream().filter(course -> course.name()
                 .equalsIgnoreCase(courseName)).findFirst().get();
       }
       return null;
    }

    public void deleteCourse(String courseName){
        if(!courses.isEmpty()){
            Course deleteCourse =  courses.stream().filter(course -> course.name().equalsIgnoreCase(courseName))
                    .findFirst().get();
            courses.remove(deleteCourse);
        }
    }

    public List<Course> getCourses(){
        if(!courses.isEmpty()){
            return courses;
        }
        return  null;
    }

}
