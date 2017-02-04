package br.com.hcb.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

    @RequestMapping("/olaMundoSpring")
    public String ola() {
        System.out.println("controller ola");
        return "ola";
    }
}
