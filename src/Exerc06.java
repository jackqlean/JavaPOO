import java.util.Scanner;
public class Exerc06 {
    public static void main(String[] args) {
        int a,b,c,d,result;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        result = (a * b - c * d);
        System.out.println("A diferença dos valores é = " + result);
        sc.close();
    }
}
