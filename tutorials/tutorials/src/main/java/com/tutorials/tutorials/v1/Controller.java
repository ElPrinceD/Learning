package com.tutorials.tutorials.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController()
@RequestMapping("")
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    private SpringService springService;

    /*
     * this is what i wanted you to do. From what I sent to you on iMessage,
     * i told you to make use of the ApplicationContext but I can't even find it
     * anywhere in your code.
     *
     * You first get the ApplicationContext and then get an object of the class you want
     * from the application context.
     * An example is shown below. Don't mind the @PostContruct. It just tells Spring to run
     * that method when an object of this controller is created
     */

    // get the application context
    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void init() {
        try {
            // get the springService from the application context because it has been annotated
            // with @Service and Spring manages the entire lifecycle of that class
            springService = applicationContext.getBean(SpringService.class);
            // now you have an instance of your SpringService class so you can call the mthods on it
            logger.info(springService.text());
        } catch (Exception e) {
            logger.warn("an error occurred while reading spring service from application context. message: " +
                    e.getMessage());
        }
    }

    @Inject
    public Controller(SpringService springService) {
        this.springService = springService;
    }

    @GetMapping
    public String text(){
        return  this.springService.text();
    }
}
