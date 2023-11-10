package com.fran.ESRINTRO.config;

import com.fran.ESRINTRO.enums.NivelUrgencia;
import com.fran.ESRINTRO.domain.Notificador;
import com.fran.ESRINTRO.annotations.TipoDoNotificador;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NotificadorConfig {

    @Bean
    @Primary
    @TipoDoNotificador(NivelUrgencia.BAIXO)
    public Notificador notificadorEmail(){
        return new Notificador( "E-mail para fulano@gmail.com" );
    }

    @Bean
    @TipoDoNotificador(NivelUrgencia.NORMAL)
    public Notificador notificadorSMS(){
        return new Notificador( "SMS para telefone cadastrado" );
    }

    @Bean
    @TipoDoNotificador(NivelUrgencia.ALTO)
    public Notificador notificadorWhatsApp(){
        return new Notificador( "Whatsapp para +55 (61) 99999-9999" );
    }

}
