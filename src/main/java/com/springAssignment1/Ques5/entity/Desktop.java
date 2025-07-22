package com.springAssignment1.Ques5.entity;

import org.springframework.stereotype.Component;


@Component("desktop")
public class Desktop implements Computer
{
    public void using()
    {
        System.out.println("on Desktop");
    }

}
