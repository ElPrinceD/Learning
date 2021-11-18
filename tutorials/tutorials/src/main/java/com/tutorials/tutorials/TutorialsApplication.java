package com.tutorials.tutorials;

import com.tutorials.tutorials.v1.SpringService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TutorialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialsApplication.class, args);

	}

	// you can create all your beans here. When you go to the @SpringBootApplication, you can
	// see that it has been annotated with @SpringConfiguration and @SpringConfiguration has also
	// been annotated with @Configuration
}
