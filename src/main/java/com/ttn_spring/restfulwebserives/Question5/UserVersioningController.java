package com.ttn_spring.restfulwebserives.Question5;


import org.springframework.web.bind.annotation.*;

@RestController
public class UserVersioningController {

    private final UserDaoServ service;

    public UserVersioningController(UserDaoServ service) {
        this.service = service;
    }

    // A) URI Versioning
    @GetMapping("/v1/user")
    public UserV1 getUserV1_URI() {
        User user = service.findOne(1);
        return new UserV1(user.getId(), user.getName(), user.getBirthDate());
    }

    @GetMapping("/v2/user")
    public UserV2 getUserV2_URI() {
        User user = service.findOne(1);
        return new UserV2(user.getId(), user.getName(), user.getBirthDate(), user.getPassword());
    }

    // B) Request Parameter Versioning
    @GetMapping(value = "/user/param", params = "version=1")
    public UserV1 getUserV1_Param() {
        User user = service.findOne(1);
        return new UserV1(user.getId(), user.getName(), user.getBirthDate());
    }

    @GetMapping(value = "/user/param", params = "version=2")
    public UserV2 getUserV2_Param() {
        User user = service.findOne(1);
        return new UserV2(user.getId(), user.getName(), user.getBirthDate(), user.getPassword());
    }

    // C) Custom Header Versioning
    @GetMapping(value = "/user/header", headers = "X-API-VERSION=1")
    public UserV1 getUserV1_Header() {
        User user = service.findOne(1);
        return new UserV1(user.getId(), user.getName(), user.getBirthDate());
    }

    @GetMapping(value = "/user/header", headers = "X-API-VERSION=2")
    public UserV2 getUserV2_Header() {
        User user = service.findOne(1);
        return new UserV2(user.getId(), user.getName(), user.getBirthDate(), user.getPassword());
    }

    // D) Mime-Type Versioning (Content Negotiation)
    @GetMapping(value = "/user/produces", produces = "application/vnd.company.app-v1+json")
    public UserV1 getUserV1_Mime() {
        User user = service.findOne(1);
        return new UserV1(user.getId(), user.getName(), user.getBirthDate());
    }

    @GetMapping(value = "/user/produces", produces = "application/vnd.company.app-v2+json")
    public UserV2 getUserV2_Mime() {
        User user = service.findOne(1);
        return new UserV2(user.getId(), user.getName(), user.getBirthDate(), user.getPassword());
    }
}
