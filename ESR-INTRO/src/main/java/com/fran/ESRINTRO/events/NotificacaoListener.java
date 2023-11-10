package com.fran.ESRINTRO.events;

import com.fran.ESRINTRO.services.ServicoConfirmacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoListener {

    @Autowired
    private ServicoConfirmacao servicoConfirmacao;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event){
        servicoConfirmacao.notificarCliente(event.getCliente());
    }

}
