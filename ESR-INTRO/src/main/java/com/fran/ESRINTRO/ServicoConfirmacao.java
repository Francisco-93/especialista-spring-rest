package com.fran.ESRINTRO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component(value = "nome-qualquer")
public class ServicoConfirmacao {

    public Notificador notificador;

    public ServicoConfirmacao(String msg){

    }

    @Autowired
    public ServicoConfirmacao(Notificador notificador) {
        this.notificador = notificador;
        if(this.notificador == null){
            throw new RuntimeException("Notificador está nulo!");
        }
    }

    public void sayHello(){
        System.out.println("Acabei de ser construído - ServicoConfirmacao");
    }

    public void sayBye(){
        System.out.println("Estou indo embora tchau - ServicoConfirmacao");
    }
}
