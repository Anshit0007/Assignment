package com.springAssignment1.Ques5;

import com.springAssignment1.Ques5.entity.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer
{
    //here the confusion will be created because computer has 2 concrete classes
    // (laptop and desktop) so we can use "Qualifier annotation" here

    @Qualifier("laptop2")
    @Autowired
    private Computer computer;
    public void build()
    {
        System.out.println("Developer is building");
        computer.using();
    }
}
