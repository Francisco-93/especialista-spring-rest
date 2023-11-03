package com.fran.ESRINTRO;

import java.util.ArrayList;
import java.util.List;

public class TesteEstatico {

    private static List<String> nomes = new ArrayList<>();

    static {
        nomes.add("Francisco");
        nomes.add("Miriã");
        nomes.add("Meg");

        nomes.add("Aureni");

        nomes.add("Marcelo");
        nomes.add("Samara");
        nomes.add("Ester");
        nomes.add("Elisa");
    }

    public static void printList(){
        System.out.println(nomes);
    }

}
