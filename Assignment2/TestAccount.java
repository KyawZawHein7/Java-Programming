import java.util.Scanner;
public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account(1122, 20000);
        acc1.setAnnualInterestRate(4.5);
        acc1.withdraw(2500);
        acc1.deposite(3000);
        System.out.println("The balance is $"+acc1.getBalance());
        System.out.println("The monthly interest is $"+acc1.getMonthlyInterest());
        System.out.println("The date of the account created is "+acc1.getDataCreated());
    }
}
