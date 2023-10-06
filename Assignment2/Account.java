import java.sql.Date;
import java.util.Scanner;
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dataCreated;

    public Account(){

    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDataCreated() {
        return dataCreated;
    }
    
    public double getMonthlyInterestRate(){
        double MonthlyInterestRate = annualInterestRate / 12;
        return MonthlyInterestRate;
    }
    public double getMonthlyInterest(){
        double MonthlyInterestRate = annualInterestRate / 12;
        double MonthlyInterest = balance * MonthlyInterestRate;
        return MonthlyInterest;
    }

    public void withdraw(double number){
        if(number > balance){
            System.out.println("Not enough Money in the Account");
        }
        else{
            this.balance = balance - number;
        }
    }

    public void deposite(double number){
        this.balance = balance + number;
    }
}
