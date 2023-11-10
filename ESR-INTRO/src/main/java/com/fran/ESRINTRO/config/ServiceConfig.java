package com.fran.ESRINTRO.config;

import com.fran.ESRINTRO.enums.NivelUrgencia;
import com.fran.ESRINTRO.domain.Notificador;
import com.fran.ESRINTRO.services.ServicoConfirmacao;
import com.fran.ESRINTRO.annotations.TipoDoNotificador;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean(initMethod = "sayHello", destroyMethod = "sayBye")
    public ServicoConfirmacao servicoConfirmacao(@TipoDoNotificador(NivelUrgencia.ALTO) Notificador notificador){
        System.out.println("Meio Notificador selecionado: " + notificador.path);
        return new ServicoConfirmacao(notificador);
    }

}
