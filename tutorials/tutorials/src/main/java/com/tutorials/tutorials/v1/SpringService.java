package com.tutorials.tutorials.v1;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class SpringService {

    /*
    ** Although you can define a bean in a class annotated with @Service,
    ** it makes sense to define it in a class annotated it with @Configuration.
    ** Or you can create your beans in your class that has the 'main' method.
    ** So for this project, you would have done that inside the TutorialsApplication.java
    **
    ** Also Beans are objects managed by Spring. You can't put @Bean on a String because Spring
    ** doesn't manage that.
    **
    ** Uncomment the code below to see how beans are defined in a configuration class.
    ** You just create a method and then return an object from the method
    */

    /*public ObjectMapper mapper() {
        return new ObjectMapper();
    }*/

    // remember to remove the @Bean from this method
    @Bean
    public String text(){
        return "Hello World";
    }
}
