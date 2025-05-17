package com.example.demo.test;

import java.io.IOException;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoApi {

    @GetMapping(value ="/test")
    public String addAnimePage() {
        return "Success";
    }
}
