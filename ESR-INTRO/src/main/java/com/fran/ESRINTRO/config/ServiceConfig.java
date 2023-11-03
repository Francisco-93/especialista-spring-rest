package com.fran.ESRINTRO.config;

import com.fran.ESRINTRO.Notificador;
import com.fran.ESRINTRO.ServicoConfirmacao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ServicoConfirmacao servicoConfirmacao(@Qualifier("notificadorSMS") Notificador notificador){
        return new ServicoConfirmacao(notificador);
    }

}
