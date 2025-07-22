package com.springAssignment1.Ques2;

//2. Write a program to demonstrate Loosely Coupled code.

import com.springAssignment1.Ques2.entity.Computer;
import com.springAssignment1.Ques2.entity.Laptop;

public class Main
{
    public static void main(String[] args)
    {
        Developer developer = new Developer();
        Computer computer= new Laptop();
        developer.build(computer);
    }
}
