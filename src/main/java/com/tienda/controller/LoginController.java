package com.tienda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//nos permite que por medio de un URL se ejecute el login en este caso
@Slf4j
public class LoginController {

    @GetMapping({"/","/login"}) // Para que nos diriga a la pagina login
    public String index() {
        return "login";//devuelve login

    }

}
