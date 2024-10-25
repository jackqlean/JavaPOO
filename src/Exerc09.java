import java.util.Scanner;
public class Exerc09 {
    public static void main(String[] args) {
        double a,b,c;
        double area,triangulo,trapezio,quadrado,retangulo;
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        area  = pi * Math.pow(c,2.0);
        triangulo = (a * c) / 2;
        trapezio = (a + b) * c / 2;
        quadrado = (b * b);
        retangulo = (a * b);
        System.out.printf("Triangulo Retangulo = %.3f%n",triangulo);
        System.out.printf("Circulo = %.3f%n",area);
        System.out.printf("Trapezio = %.3f%n",trapezio);
        System.out.printf("Quadrado = %.3f%n",quadrado);
        System.out.printf("Retangulo = %.3f%n",retangulo);
        sc.close();
    }
}
