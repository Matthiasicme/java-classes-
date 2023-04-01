package com.example.aoop2.mobileZoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //gives back data
@RequestMapping("/zoo")
public class ZooController {
    @GetMapping("/test")
    public String test(){
        Animal dog = new Animal("canis", "szarik", true);
        return dog.toString();
    }

    @GetMapping("/test2")
    public String test2(){
        return "pozdro 600";
    }
}
