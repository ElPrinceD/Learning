package com.tutorials.tutorials.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController()
@RequestMapping("")
public class Controller {

    private final SpringService springService;


    @Inject
    public Controller(SpringService springService) {
        this.springService = springService;
    }

    @GetMapping
    public String text(){
        return  this.springService.text();
    }
}
