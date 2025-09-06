package com.klu.calc_backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
@CrossOrigin(origins = "*")
public class add {

    @GetMapping("/add/{a}/{b}")
    public int addNumbers(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }
}
