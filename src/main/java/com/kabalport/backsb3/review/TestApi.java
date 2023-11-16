package com.kabalport.backsb3.review;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestApi {

    @GetMapping("/hello/world")
    public String helloWorld() {
        return "[Get] Hello, world2!";
    }

    @PostMapping("/hello/world")
    public String postHelloWorld() {
        return "[Post] Hello, world";
    }

    @PutMapping("/hello/world")
    public String putHelloWorld() {
        return "[Put] Hello, world";
    }

    @DeleteMapping("/hello/world")
    public String deleteHelloWorld() {
        return "[Delete] Hello, world";
    }
}
