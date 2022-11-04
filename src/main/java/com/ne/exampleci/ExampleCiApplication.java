package com.ne.exampleci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExampleCiApplication {

    @GetMapping("/")
    public String welcome() {
        return "Salut sambo bienvenue sur ton test d'integration";
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleCiApplication.class, args);
    }

}

