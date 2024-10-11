package application;
import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
        System.out.print("Enter account number: ");
        //Account account = new Account();
        int number = sc.nextInt();
        //System.out.println(account.getNumber());
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        //System.out.println(account.getHolder());
        System.out.print("Enter initial deposit value: ");

        System.out.print("Is there an initial deposit (y/n)");
        char r = sc.nextLine().charAt(0);
        if (r =='y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }else{
            account = new Account(number,holder);
        }
        //account.addDeposit(sc.nextInt());
        //System.out.println(account.toString());
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposite value :");
        double depositValue = sc.nextDouble();
        account.addDeposit(depositValue);
        System.out.println("Updated account date :");
        System.out.println(account);
        System.out.println();
        System.out.print("Enter a value for remove of account:");
        double removeValue;
        removeValue = sc.nextDouble();
        account.removeDeposit(removeValue);
        System.out.println("Updated account date :");
        System.out.println(account);

        sc.close();
    }
}
