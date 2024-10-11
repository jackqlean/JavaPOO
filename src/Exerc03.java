import java.util.Scanner;
public class Exerc03 {
    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        System.out.printf("Você digitou o valor : %.2f",x);
        sc.close();
    }
}
