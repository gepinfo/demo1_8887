package com.geppetto.demo1.controller;

import com.geppetto.demo1.dto.StudentDto;
import com.geppetto.demo1.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

   private final StudentService studentService;

   public StudentController(StudentService studentService) {
      this.studentService = studentService;
   }

    @PostMapping
    public ResponseEntity<StudentDto> create(@RequestBody StudentDto studentDto) {
      return ResponseEntity.status(HttpStatus.OK).body(studentService.create(studentDto));
    }


    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getEntityById(@PathVariable String id) {
       return ResponseEntity.ok(studentService.getEntityById(id));
    }


    @GetMapping
     public ResponseEntity<List<StudentDto>> getAllValues() {
       return ResponseEntity.ok(studentService.getAllValues());
     }


    @PutMapping
    public ResponseEntity<StudentDto> update(@RequestBody StudentDto studentDto) {
       return ResponseEntity.ok(studentService.update(studentDto));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
       return ResponseEntity.ok(studentService.delete(id));
    }


    @GetMapping("/search")
    public ResponseEntity<List<StudentDto>> search(@RequestParam Map<String, String> allParams) {
       return ResponseEntity.ok(studentService.search(allParams));
    }
    

}