package br.com.guilherme.gerenciador.teste;

import br.com.guilherme.gerenciador.Aula;

import java.util.ArrayList;

public class TesteListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as arrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas de objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
    }
}
