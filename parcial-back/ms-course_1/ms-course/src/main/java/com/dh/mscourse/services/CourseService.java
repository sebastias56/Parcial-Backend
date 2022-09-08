package com.dh.mscourse.services;

import com.dh.mscourse.models.Course;
import com.dh.mscourse.models.Student;
import com.dh.mscourse.repositories.ICourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final ICourseRepository repository;
    private final StudentService service;

    public Course findCourseById(Integer id){
        Course course = repository.findById(id).orElse(null);
        List<Student> students =  service.findAll();
        if(course != null)
            course.setStudents(students);
        return course;
    }
}
