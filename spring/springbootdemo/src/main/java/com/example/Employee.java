package com.example;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    int employeeId=200;
    String employeeName="vharsha";
    public void display(){
        System.out.println(employeeId+ " "+employeeName);
    }
}
