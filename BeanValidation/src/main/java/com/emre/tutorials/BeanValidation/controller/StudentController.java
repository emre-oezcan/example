package com.emre.tutorials.BeanValidation.controller;

import com.emre.tutorials.BeanValidation.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/students")
public class StudentController {
/*
    @Autowired
    private final StudentService studentService;


 */
    @PostMapping
    public void createStudent(@RequestBody @Valid Student student) {

    }
/*
    @GetMapping("/students")
    public List<Student> retrieveAllStudents() {
        return studentService.retrieveAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student retrieveStudent(@PathVariable Long id) {
        return studentService.retrieveStudent(id);
    }


 */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        return ex.getBindingResult().getAllErrors()
                .stream()
                .map(objectError -> (FieldError) objectError)
                .map(fieldError -> fieldError.getField() + " - " + fieldError.getDefaultMessage())
                .collect(Collectors.toList());
    }
}
