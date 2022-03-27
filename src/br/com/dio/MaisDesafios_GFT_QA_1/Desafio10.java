package br.com.dio.MaisDesafios_GFT_QA_1;

/*
 *Ler um número inteiro N e calcular todos os seus divisores.
 * Entrada
 * O arquivo de entrada contém um valor inteiro.
 * Saída
 * Escreva todos os divisores positivos de N, um valor por linha.
 *
 */

import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
