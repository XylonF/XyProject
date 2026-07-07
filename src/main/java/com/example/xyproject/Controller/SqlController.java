package com.example.xyproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SqlController {
    @GetMapping("/test")
    public String test(){

        return "test";
    }

}
