import java.util.Scanner;
public class Exerc04 {
    public static void main(String[] args) {
        int x,y,soma;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        soma = x + y;
        System.out.println("A soma dos valores das variáveis  x + y é = " + soma);
        sc.close();
    }
}
