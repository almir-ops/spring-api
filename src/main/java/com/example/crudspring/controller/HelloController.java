package com.example.crudspring.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String hello(){
        return "Api Spring";
    }

}
