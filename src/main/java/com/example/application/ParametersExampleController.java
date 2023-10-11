package com.example.application;

import org.springframework.web.bind.annotation.*;

@RestController
public class ParametersExampleController {

    @GetMapping("get-test")
    public String getTest(@RequestParam Integer a, @RequestParam Integer b) {
        return "received params: a = " + a + ", b = " + b;
    }

    @PostMapping("post-test")
    public String postTest(@RequestParam Integer a, @RequestParam Integer b) {
        return "received params: a = " + a + ", b = " + b;
    }

    @GetMapping("url-test/{v}")
    public String urlTest(@PathVariable String v) {
        return "received path variable v = " + v;
    }

    @PostMapping("body-test")
    public String bodyTest(@RequestBody String body) {
        return "received body: " + body;
    }
}
