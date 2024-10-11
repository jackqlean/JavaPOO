package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        Account account = new Account();
        account.setNumber(Integer.parseInt(sc.nextLine()));
        //System.out.println(account.getNumber());
        System.out.print("Enter account holder: ");
        account.setHolder(sc.nextLine());
        //System.out.println(account.getHolder());
        System.out.print("Enter initial deposit value: ");
        //System.out.print("Is there an initial deposit (y/n)");
        /*public boolean r = sc.nextLine();
        if (r !=0){
            System.out.println("initial value can not = 0.00 in your account !!");
        }else{
            System.out.print("Enter initial deposit value:");
        }*/
        account.setDeposite(Double.parseDouble(sc.nextLine()));
        //System.out.println(account.toString());
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();
        System.out.println("Enter a deposit value: ");
        //account.
        //System.out.print("Account " + account.getNumber()+", Holder: "+account.getHolder()+", Balance: $"+String.format("%.2f", account.getDeposite()));
    }
}
