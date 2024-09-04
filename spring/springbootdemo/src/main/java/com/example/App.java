package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Employee e1=ac.getBean(Employee.class);
        e1.display();
        Student s1=ac.getBean(Student.class);
        s1.display();
        Courses c=ac.getBean(Courses.class);
        c.display();


    }
}
