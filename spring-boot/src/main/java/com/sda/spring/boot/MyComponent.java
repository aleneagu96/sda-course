package com.sda.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private static final Logger logger = LoggerFactory.getLogger(MyComponent.class);

    public void complexOperation() {
        logger.info("here goes an info message");
        logger.debug("here goes a debug message");
        logger.warn("here goes a warning message");
        logger.error("here goes an error message");

    }
}
