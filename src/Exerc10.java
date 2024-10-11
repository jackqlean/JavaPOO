import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = x;
        while (x != 0) {
            x = sc.nextInt();
            soma += x;
        }
        System.out.println("A soma dos valores das variáveis  x = " + soma);
        sc.close();
    }
}
