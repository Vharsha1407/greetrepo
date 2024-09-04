package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {
    @Autowired
    Courses courses;
    public void show(){
        courses.display();
    }    

}
