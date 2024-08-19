package com.geppetto.demo1.service;

import com.geppetto.demo1.dto.StudentDto;
import java.util.List;
import java.util.Map;

public interface StudentService {

    StudentDto create(StudentDto studentDto);


    StudentDto getEntityById(String id);


    List<StudentDto> getAllValues();


    StudentDto update(StudentDto studentDto);


    String delete(String id);


    List<StudentDto> search(Map<String, String> allParams);


}
