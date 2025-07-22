package com.springAssignment1.Ques6;


//6. Perform Constructor Injection in a Spring Bean
import com.springAssignment1.Ques6.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("std2");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age:  " + student.getAge());
    }
}
