package br.com.guilherme.gerenciador.teste;

import br.com.guilherme.gerenciador.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as arrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas de objetos", 10);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        System.out.println("|--------------- Ordenando aulas default -------------|");
        Collections.sort(aulas);

        System.out.println("|--------------- Ordenando aulas usaundo interface comparator -------------|");
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
    }
}
