package com.springAssignment1.Ques2;

import com.springAssignment1.Ques2.entity.Computer;

public class Developer
{

    Computer computer;
    public void build(Computer computer)
    {
        System.out.println("Developer is building");
        computer.using();
    }
}
