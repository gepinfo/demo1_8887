package com.geppetto.demo1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;






@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private String _id;
    
    private String student_name;
    
    private Number student_age;
    
    }
