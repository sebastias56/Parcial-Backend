package com.dh.msstudent.repositories;

import com.dh.msstudent.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
