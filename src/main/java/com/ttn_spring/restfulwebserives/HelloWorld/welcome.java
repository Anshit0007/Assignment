package com.ttn_spring.restfulwebserives.HelloWorld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class welcome {
    private MessageSource messageSource;

    public welcome(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String username, Locale locale) {
        return messageSource.getMessage("greeting.message", new Object[]{username}, locale);
    }

    @GetMapping(path ="/hello-world-internationalized")
    public String helloWorldInternationalized(){
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",null,"Default Message",locale);

    }

}
