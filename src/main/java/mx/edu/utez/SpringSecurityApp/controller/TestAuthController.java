package mx.edu.utez.SpringSecurityApp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@PreAuthorize("denyAll()")
public class TestAuthController {

    //ENDPOINT DE PRUEBA PARA PERMITIR ACCESO
    @GetMapping("/hello")
    @PreAuthorize("permitAll()")
    public String hello(){
        return "Hello World";
    }

    //ENDPOINT DE PRUEBA PARA DENEGAR ACCESO
    @GetMapping("/hello-secured")
    @PreAuthorize("hasAuthority('CREATE')")
    public String helloSecured(){
        return "Hello World Secured";
    }

    @GetMapping("/hello-secured2")
    public String helloSecured2(){
        return "Hello World Secured2";
    }
}
