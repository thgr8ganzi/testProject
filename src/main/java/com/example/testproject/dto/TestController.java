package com.example.testproject.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RestController
public class TestController {
    @GetMapping(path = "/test")
    public String getParam(
            @RequestParam(name = "param1", defaultValue = "true") String param1,
            @RequestParam(name = "param2", defaultValue = "false") String param2
    ) {
        return "param1: " + param1 + ", param2: ";
    }
    
}

