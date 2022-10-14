package com.emre.tutorials.BeanValidation.model;

import com.emre.tutorials.BeanValidation.validation.Phone;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;

@NoArgsConstructor
public class Student {

    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String mail;
    @NotBlank
    @Phone
    private String phone;

    public Student(String name, String mail, String phone) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Service
    @RequiredArgsConstructor
    public static class StudentService {

        @Autowired
        private final StudentRepository studentRepository;

        @GetMapping("/students")
        public List<Student> retrieveAllStudents(){
            return studentRepository.findAll();
        }

        @GetMapping("/students/{id}")
        public Student retrieveStudent(@PathVariable Long id){
            Optional<Student> student = studentRepository.findById(id);
            if(student.isEmpty()){
                throw new StudentNotFoundException("id" + id);
            }
            return student.get();
        }
    }
}
