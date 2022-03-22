import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        int distanciaKm;
        Scanner input = new Scanner(System.in);
        distanciaKm = input.nextInt();
        int minutos = distanciaKm * 2 ;
        System.out.printf( minutos + " minutos\n");
    }
}