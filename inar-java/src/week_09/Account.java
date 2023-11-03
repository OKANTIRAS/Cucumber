package week_09;

import java.util.Date;

public class Account {
    private int id = 0;

    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    Account() {
    }

    Account(int id,double balance){
        this.id = id;
        this.balance = balance;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }
    public double getMonthlyInterest(){
        return balance * annualInterestRate;
    }
    public void withdraw (double amount){
        if(balance > amount){
            balance -= amount;
        }else{
            System.out.println("You have not enough money");
        }
    }
    public void deposit (double amount){
        balance += amount;
    }



}
