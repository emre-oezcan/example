package com.in28minutes.springboot.rest.example.springboot2restservicebasic.student;

import com.in28minutes.springboot.rest.example.springboot2restservicebasic.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
