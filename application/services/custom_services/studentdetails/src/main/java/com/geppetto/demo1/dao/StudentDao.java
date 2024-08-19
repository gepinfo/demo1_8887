package com.geppetto.demo1.dao;

import com.geppetto.demo1.model.Student;
import java.util.List;
import java.util.Optional;


public interface StudentDao {

    Student create(Student student);


    Optional<Student> getEntityById(String id);


    List<Student> getAllValues();


    Optional<Student> update(String id);


    void delete(String id);

}
