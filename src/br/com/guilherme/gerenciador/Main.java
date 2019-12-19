package br.com.guilherme.gerenciador;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com Cursos e Sets";
        String aula4 = "Aumentando conhecimento";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        System.out.println(aulas);
        aulas.remove(0);
        System.out.println(aulas);

        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        for(int i = 0; i < aulas.size(); i++) {
            System.out.println("Pegando aula usando for:  " + aulas.get(i));
        }

        System.out.println("O tamanho da lista é: " + aulas.size());

        aulas.forEach( aula -> System.out.println("Aula usando foreach: " + aula));

        System.out.println("!---------------- Ordenando listas --------------! ");

        Collections.sort(aulas);

        System.out.println("Aulas ordenadas: " + aulas);
    }
}
