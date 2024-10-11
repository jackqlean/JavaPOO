import java.util.Scanner;
public class Exerc08 {
    public static void main(String[] args) {
        int code1,code2,num_peca1,num_peca2;
        double val_unit1,val_unit2,val_pecas;
        Scanner sc = new Scanner(System.in);
        code1 = sc.nextInt();
        num_peca1 = sc.nextInt();
        val_unit1 = sc.nextDouble();
        code2 = sc.nextInt();
        num_peca2 = sc.nextInt();
        val_unit2 = sc.nextDouble();
        val_pecas = (num_peca1*val_unit1)+(num_peca2*val_unit2);
        System.out.printf("O valor a ser pago é = %.2f%n" , val_pecas);
        sc.close();
    }
}
