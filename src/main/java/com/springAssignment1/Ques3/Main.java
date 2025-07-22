package com.springAssignment1.Ques3;

//2. Write a program to demonstrate Loosely Coupled code.

import com.springAssignment1.Ques3.entity.Computer;
import com.springAssignment1.Ques3.entity.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Developer developer= context.getBean(Developer.class);
        developer.build();
    }
}
