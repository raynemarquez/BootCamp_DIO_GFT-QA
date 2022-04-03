package br.com.dio.DesafiosIntermediários_GFT_QA_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Desafio
 * Uma das técnicas mais poderosas usadas pelos ninjas, chamada de Kage Bunshin no Jutsu e
 * conhecida também como "Técnica dos clones de sombra",
 * é capaz de produzir uma cópia idêntica da pessoa que utilizar essa técnica.
 *
 * É como uma espécie de mitose, na qual um ninja vira dois,
 * sem possibilidade de diferenciar qual é o original e qual é a cópia.
 *
 * E por se tratar de uma cópia fidedigna, essa cópia por si só também é capaz de realizar a técnica de clone de sombra e,
 * portanto, se o original e a cópia o fizeram, isso resultaria em 4 ninjas no total.
 * E assim por diante, numa multiplicidade quase infinita a depender da habilidade do ninja.
 *
 * Há N ninjas diante de você, mas ao invés de contá-los usando seus reflexos,
 * o que seria muito difícil, você irá usar seus conhecimentos em programação para determinar quantos existem.
 *
 * Entrada
 * A entrada contém vários casos de teste.
 * Cada caso contém uma linha com o número N (1 ≤ N ≤ 106).
 * É garantido que o valor de N é tal que é possível obter exatamente N cópias de um ninja utilizando a técnica(incluindo o original).
 *
 * Saída
 * Para cada caso de teste, imprima uma linha contendo o número de vezes que a técnica foi utilizada.
 */

public class Desafio14 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();
        List<Integer> listaNinjas = new ArrayList<Integer>();

        while(leitor.hasNext()){
            lista.add(leitor.next());
            listaNinjas = lista.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        }
        for (Integer ninja: listaNinjas) {
            System.out.println(ninja/2);
        }
    }
}
