package com.securityexample.demosecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String helloToAll(){
        return ("<h1 style=\"background-color:powderblue\";>Hello everyone!</h1>");
    }
    @GetMapping("/user")
    public String welcomeUser(){
        return ("<h1 style=\"background-color:MediumSeaGreen\";>Welcome user!</h1>");
    }
    @GetMapping("/admin")
    public String welcomeAdmin(){
        return ("<h1 style=\"background-color:SlateBlue\";>Welcome admin!</h1>");
    }
}
