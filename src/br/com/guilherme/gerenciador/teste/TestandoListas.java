package br.com.guilherme.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        ArrayList<String> cursos = new ArrayList<>();
        String curso1 = "Java 8 e novas API";
        String curso2 = "Spring boot";
        String curso3 = "Conceitos de sistemas distribuidos";

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println(cursos);

        System.out.println("|------------ Acessando elemento da lista(indice) ------------|");
        System.out.println("O primeiro curso é: " + cursos.get(0));
        System.out.println("|------------ Ordenando usando a classe Collections ------------|");
        Collections.sort(cursos);
        System.out.println(cursos);
    }

}
