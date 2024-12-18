package mx.edu.utez.SpringSecurityApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class TestAuthController {

    //ENDPOINT DE PRUEBA PARA PERMITIR ACCESO
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    //ENDPOINT DE PRUEBA PARA DENEGAR ACCESO
    @GetMapping("/hello-secured")
    public String helloSecured(){
        return "Hello World Secured";
    }
}
