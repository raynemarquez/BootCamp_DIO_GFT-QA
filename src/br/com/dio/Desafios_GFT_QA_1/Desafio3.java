package br.com.dio.Desafios_GFT_QA_1;
import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, Y;
        for (int i = 0; i < N; i++) {
            X = leitor.nextInt();
            Y = leitor.nextInt();
            if (Y == 0) {
                System.out.println("divisao impossivel");
            }
            else{
                System.out.printf("%.1f\n" ,(double) X / Y);
            }
        }
    }
}