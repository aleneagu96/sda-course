package com.sda.spring.core.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// service is an alias for component , but is more specific

@Service
public class FooService {

    //    delegate to formatter
    @Autowired
    @Qualifier("fooFormatter")
    private Formatter formatter;

    public void run() {
        formatter.format("hello");


    }


}
