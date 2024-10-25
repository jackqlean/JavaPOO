import java.util.Scanner;
public class Exerc05 {
    public static void main(String[] args) {
        double area,raio;
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();
        area  = pi * Math.pow(raio,2.0);
        System.out.printf("A area do circulo é = %.4f%n",area);
        sc.close();
    }
}
