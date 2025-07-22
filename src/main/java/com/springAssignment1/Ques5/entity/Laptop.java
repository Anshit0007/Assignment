package com.springAssignment1.Ques5.entity;

import org.springframework.stereotype.Component;

@Component("laptop2")
public class Laptop implements Computer
{
    public void using()
    {
        System.out.println("on Laptop");
    }
}
