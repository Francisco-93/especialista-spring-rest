package com.fran.ESRINTRO.controller;

import com.fran.ESRINTRO.services.AtivacaoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @Autowired
    private AtivacaoClienteService ativacaoClienteService;

    @GetMapping("/hello")
    public String hello(){
        ativacaoClienteService.ativarCliente();
        return "Hello World!";
    }


}
