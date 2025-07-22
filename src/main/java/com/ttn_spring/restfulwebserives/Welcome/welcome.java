package com.ttn_spring.restfulwebserives.Welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
    @GetMapping(path ="/welcome")
    public String welcome(){
        return "Welcome to spring boot";
    }

}
