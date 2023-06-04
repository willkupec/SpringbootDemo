package com.SpringbootDemo.Backend.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class HomeController {

    @GetMapping("")
    public String viewHomePage() {
        return "Springboot API Running";
    }

}