package com.fran.ESRINTRO.services;

import com.fran.ESRINTRO.domain.Cliente;
import com.fran.ESRINTRO.events.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;


    public void ativarCliente(){
        Cliente cliente = new Cliente("Miriã Costa");
        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }

}
