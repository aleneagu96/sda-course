package com.sda.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CustomCommandLineRunner implements CommandLineRunner {

//    sl4j logger

    private static final Logger logger = LoggerFactory.getLogger(CustomCommandLineRunner.class);

    @Autowired
    private MyComponent myComponent;

    @Override
    public void run(String... args) throws Exception {
//        log that I reached to this point
        logger.info("----inside run method");
        myComponent.complexOperation();
    }
}
