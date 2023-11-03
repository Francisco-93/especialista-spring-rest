package com.fran.ESRINTRO;

import org.springframework.stereotype.Component;

@Component
public class FirstBeanComponent {

    public FirstBeanComponent(SecondBeanComponent secondBeanComponent) {
        System.out.println("\n O Spring me instanciou =) \n");
    }

}
