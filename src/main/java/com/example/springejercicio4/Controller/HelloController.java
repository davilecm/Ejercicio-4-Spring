package com.example.springejercicio4.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hola")

    public String HolaMundo() {

        return "Hola mundo";

    }
}