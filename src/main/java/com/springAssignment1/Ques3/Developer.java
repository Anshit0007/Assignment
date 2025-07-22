package com.springAssignment1.Ques3;

import com.springAssignment1.Ques3.entity.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("developer1")
public class Developer
{
    @Autowired
    private Computer computer;
    public void build()
    {
        System.out.println("Developer is building");
        computer.using();
    }
}
