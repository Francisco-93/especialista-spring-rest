package com.fran.ESRINTRO.config;

import com.fran.ESRINTRO.NivelUrgencia;
import com.fran.ESRINTRO.Notificador;
import com.fran.ESRINTRO.ServicoConfirmacao;
import com.fran.ESRINTRO.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ServicoConfirmacao servicoConfirmacao(@TipoDoNotificador(NivelUrgencia.ALTO) Notificador notificador){
        System.out.println(notificador.path);
        return new ServicoConfirmacao(notificador);
    }

}
