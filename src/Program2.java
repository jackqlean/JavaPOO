import java.util.Scanner;

import static java.lang.System.*;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int soma = 0;
        int i;
        int a = 0;
        int b = 0;
        int c = 0;
        int v[] = new int[4];
        out.println("Entre com 3 números a seguir !");
        for (i = 1; i < 4; i++) {
            out.print("Entre com o " + i + "º número :");
            v[i] = sc.nextInt();
            //out.println("Os valores do vetor v[" + i + "] é = " + v[i]);
            if (i > 0 && i <= 1) {
                a = v[i];
                //out.println(a);
            }
            if (i > 1 && i <= 2) {
                b = v[i];
                //out.println(b);
            }
            if (i > 2 && i <= 3) {
                c = v[i];
                //out.println(c);
            }
            out.println("");
        }
        int higher = max(a, b, c);
        showResult(higher);
        sc.close();
    }
    public static int max (int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }else if(y > z){
            aux = y;
        }
        else{
            aux = z;
        }
    return aux;
    }
    public static void showResult(int value){
        out.println("O maior número dos digitados é = " + value);
    }
}