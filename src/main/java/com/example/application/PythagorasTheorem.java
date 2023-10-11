package com.example.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Math.sqrt;

@RestController
public class PythagorasTheorem {

    @GetMapping("Pythagoras-test")
    public String pythagorasTest(@RequestParam Double a, @RequestParam Double b) {
        if (a < 0 || b < 0) {
            return "Вы ввели некорректное значение";
        }
        return String.format("x = %f.3, y = %f.3, гипотенуза = %f.3", a, b, sqrt(a*a + b*b));
    }

}
