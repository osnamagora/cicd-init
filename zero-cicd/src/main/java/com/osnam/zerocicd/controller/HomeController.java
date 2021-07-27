package com.osnam.zerocicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/{name}")
    public String Home(@PathVariable("name") String name) {
        return "Hello " + name + "You are welcome in Agora";
    }
}
