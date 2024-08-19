package com.geppetto.demo1.repository;

import com.geppetto.demo1.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>  {

}
