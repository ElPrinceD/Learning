package com.tutorials.tutorials.v1;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class SpringService {


    @Bean
    public String text(){
        return "Hello World";
    }
}
