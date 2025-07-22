package com.springAssignment1.Ques4;

//4. Get a Spring Bean from application context and display its properties.
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("std");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age:  " + student.getAge());
    }
}
