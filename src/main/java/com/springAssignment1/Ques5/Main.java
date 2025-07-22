package com.springAssignment1.Ques5;

//5. Demonstrate how you will resolve ambiguity while autowiring bean

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
