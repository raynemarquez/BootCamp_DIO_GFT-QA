package br.com.dio.Desafios_GFT_QA_1;
import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args){

        //complete os espaços em branco com sua solução para o problema

        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        horas = (fim-inicio);

        if(horas == 0){
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }else if(horas < 0   ){
            System.out.print("O JOGO DUROU " + (24-inicio+fim) + " HORA(S)\n");
        }else{
            System.out.print("O JOGO DUROU " +  horas + " HORA(S)\n");
        }
    }
}