package com.fran.ESRINTRO.config;

import com.fran.ESRINTRO.NivelUrgencia;
import com.fran.ESRINTRO.Notificador;
import com.fran.ESRINTRO.TipoDoNotificador;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NotificadorConfig {

    @Bean
    @Primary
    @TipoDoNotificador(NivelUrgencia.BAIXO)
    public Notificador notificadorEmail(){
        return new Notificador( "smtp.algamail.com.br" );
    }

    @Bean
    @TipoDoNotificador(NivelUrgencia.NORMAL)
    public Notificador notificadorSMS(){
        return new Notificador( "SMS.algamail.com.br" );
    }

    @Bean
    @TipoDoNotificador(NivelUrgencia.ALTO)
    public Notificador notificadorWhatsApp(){
        return new Notificador( "+55 (61) 99999-9999" );
    }

}
