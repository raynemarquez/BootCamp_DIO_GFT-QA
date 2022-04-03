package br.com.dio.DesafiosIntermediários_GFT_QA_1;

/*
 * Desafio
 * Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string.
 *
 * Deve começar pela primeira letra da primeira string,
 * seguido pela primeira letra da segunda string,
 * em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.
 *
 * As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.
 *
 * Entrada
 * A entrada contém vários casos de teste.
 * A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir.
 * Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres,
 * cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.
 *
 * Saída
 * Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.
 */
import java.util.Scanner;

public class Desafio15 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int casosDeTestes = Integer.parseInt(leitor.nextLine());

        for(int i = 1; i <= casosDeTestes; i++) {

            StringBuilder resultado = new StringBuilder();
            String[] palavras = leitor.nextLine().split(" ");

            int tamanhoMax = Math.max (
                    palavras[0].length(),
                    palavras[1].length());

            for(int dados = 0; dados < tamanhoMax; dados++) {
                if(dados < palavras[0].length()) {
                    resultado.append(palavras[0].charAt(dados));
                }
                if(dados < palavras[1].length()) {
                    resultado.append(palavras[1].charAt(dados));
                }
            }
            System.out.println(resultado.toString());
        }
    }
}
