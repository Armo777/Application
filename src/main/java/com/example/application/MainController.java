package com.example.application;

// Контроллер - класс, отвечающий за обработку запросов к приложению

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    // контроллер содержит обработчики (handlers) входящих запросов

    @GetMapping("")
    public String index() {
        return "Server is running";
    }

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }


    @GetMapping("info")
    public String info() {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");
        String total = String.format("Операционная система: %s \n Версия ОС: %s \n Архитектура: %s", osName, osVersion, osArch);
        return total;
    }
}
