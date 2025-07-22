package com.springAssignment1.Ques1;

public class Developer
{
    //Tightly Coupled
    Laptop laptop = new Laptop();
    public void build()
    {
        System.out.println("Developer is building");
        laptop.using();
    }
}
