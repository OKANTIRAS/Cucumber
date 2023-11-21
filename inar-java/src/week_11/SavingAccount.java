package week_11;

import week_09.Account;

public class SavingAccount extends Account {

    public SavingAccount(){

    }
    public SavingAccount(int id,double initialBalance){
        super(id,initialBalance);
    }

    public String toString(){
        return "ID: " + super.getId() +
        "\nBalance is $" + super.getBalance();
    }
}
