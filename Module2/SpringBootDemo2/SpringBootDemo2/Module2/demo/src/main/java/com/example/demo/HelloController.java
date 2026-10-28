package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it is gateway where we can write api endpoint
public class HelloController {
    // --> /hello

    @GetMapping("hello")
    public String hello() {
        return "<h1>Hello world</h1>";
    }
    
    @GetMapping("bye")
    public String Bye(){
        return "<h1>Bye</h1>";
        }

}
