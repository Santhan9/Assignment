package com.example.Assignment.controller;




import com.example.Assignment.Repository.StudentRepository;
import com.example.Assignment.dto.StudentDTO;
import com.example.Assignment.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TitanController {


    @Autowired
    StudentRepository studentRepository;



    @GetMapping("/students")
    public ResponseEntity<Student> getAllComments() {

        return studentRepository.findAll();
    }


    @PostMapping("/students")
    public ResponseEntity createComment(@RequestBody StudentDTO studentDto) {
        Student student = new Student(studentDto.getsId(),studentDto.getsName(),studentDto.getsEmail(),studentDto.getsCourse());
         studentRepository.save(student);
        return ResponseEntity.ok().build();
    }



}
