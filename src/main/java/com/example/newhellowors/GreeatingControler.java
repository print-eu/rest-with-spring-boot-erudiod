package com.example.newhellowors;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreeatingControler {
        private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();
    @RequestMapping("/hello")

     public Greeting greeting(@RequestParam(value = "name", defaultValue =  "world")String name)
     {
         return new Greeting(counter.incrementAndGet(), String.format(template,name));
     }
}
