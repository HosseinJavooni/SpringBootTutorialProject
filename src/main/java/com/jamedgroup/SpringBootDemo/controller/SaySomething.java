package com.jamedgroup.SpringBootDemo.controller;

import com.jamedgroup.SpringBootDemo.model.Person;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/saysome")
//@Controller
//@ResponseBody
public class SaySomething {
    @GetMapping(path = "/hello", produces=MediaType.APPLICATION_XML_VALUE)
    public String say(){
        return "Hi I am in context now!";
    }

    @GetMapping(path = "/person", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Person> returnPerson(){
        return Arrays.asList(
                new Person("Hossein", "Javooni", 37),
                new Person("Mahan", "Javooni", 1)
                );
    }

}
