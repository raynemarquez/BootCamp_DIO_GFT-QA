import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int A, B;

        for (int i = 0; i < count; i++) {
            A = scan.nextInt();
            B = scan.nextInt();
            if ((Integer.toString(A).endsWith(Integer.toString(B)))) System.out.println("encaixa");
            else System.out.println("nao encaixa");
        }
    }
}