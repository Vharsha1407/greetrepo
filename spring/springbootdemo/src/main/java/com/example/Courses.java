package com.example;

import org.springframework.stereotype.Component;

@Component
public class Courses {
    int c_id=24;
    String c_name="java";
    public void display(){
        System.out.println("course id:"+c_id);
        System.out.println("course name:"+c_name);
    }

}
