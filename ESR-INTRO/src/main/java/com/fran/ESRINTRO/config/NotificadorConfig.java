package com.fran.ESRINTRO.config;

import com.fran.ESRINTRO.Notificador;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NotificadorConfig {

    @Bean
    @Primary
    public Notificador notificadorEmail(){
        return new Notificador( "smtp.algamail.com.br" );
    }

    @Bean
    public Notificador notificadorSMS(){
        return new Notificador( "SMS.algamail.com.br" );
    }

}
