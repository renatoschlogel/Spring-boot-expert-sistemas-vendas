package com.renatoschlogel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @Vaca
    private Animal animal;

    @Value("${application.name}")
    public String applicationNameProperties;

    @GetMapping("/oi")
    public String oi(){
        return animal.fazerBarulho();
    }

    public static void main(String[] args) {

        SpringApplication.run(VendasApplication.class, args);
    }
}
