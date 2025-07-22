package com.springAssignment1.Ques3.entity;

import org.springframework.stereotype.Component;

@Component("laptop1")
public class Laptop implements Computer
{
    public void using()
    {
        System.out.println("on Laptop");
    }
}
