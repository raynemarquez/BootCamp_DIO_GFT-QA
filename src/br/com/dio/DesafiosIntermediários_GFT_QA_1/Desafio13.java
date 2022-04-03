package br.com.dio.DesafiosIntermediários_GFT_QA_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Desafio
 * Crie um programa onde você receberá valores inteiros não negativos como entrada.
 *
 * Ordene estes valores de acordo com o seguinte critério:
 *
 * Primeiro os Pares
 * Depois os Ímpares
 * Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.
 *
 * Entrada
 * A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
 * Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão,
 * cada uma delas, um valor inteiro não negativo.
 *
 * Saída
 * Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
 * Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
 */
public class Desafio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdeNumeros = 0;
        qtdeNumeros = leitor.nextInt();

        List<String> listaNumeros = new ArrayList<String>();

        for (int i=0; i < qtdeNumeros; i++){
            String next = leitor.next();
            listaNumeros.add(next);
        }

        List<Integer> listaNumerosPares = listaNumeros.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<Integer> listaNumerosImpares = listaNumeros.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 != 0))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        for (Integer numeroPar: listaNumerosPares) {
            System.out.println(numeroPar);
        }
        for (Integer numeroImpar: listaNumerosImpares) {
            System.out.println(numeroImpar);
        }
    }
}
