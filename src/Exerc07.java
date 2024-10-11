import java.util.Scanner;
public class Exerc07 {
    public static void main(String[] args) {
        int number,hours;
        double recsalary_hours,salary;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        hours = sc.nextInt();
        recsalary_hours = sc.nextDouble();
        salary = hours * recsalary_hours;
        System.out.println("Number = " + number);
        System.out.printf("Salary = U$ %.2f%n",salary);
        sc.close();
    }
}
