package com.fran.ESRINTRO;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SecondBeanComponent {

//    Exemplo de referência cíclica
//    public SecondBeanComponent(FirstBeanComponent firstBeanComponent) {
//        System.out.println("\n O Spring me instanciou =) SecondBeanComponent  \n");
//    }


    public SecondBeanComponent() {
        System.out.println("\n O Spring me instanciou =) SecondBeanComponent  \n");
    }

    @PostConstruct
    public void sayHello(){
        System.out.println("Acabei de ser construído");
    }

    @PreDestroy
    public void sayBye(){
        System.out.println("Estou indo embora tchau");
    }

}
