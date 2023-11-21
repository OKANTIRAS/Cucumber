package week_11;

import week_09.Account;

public class CheckingAccount extends Account {
    private double overDraft;

    public CheckingAccount() {

    }

    public CheckingAccount(double overDraft, int id, int initialBalance) {
        super(id, initialBalance);
        this.overDraft = overDraft;
    }
    public void withdraw(double amount){
        if(super.getBalance() + overDraft > amount){
            super.setBalance(getBalance() - amount);
        }else{
            System.out.println("Not enough money");
        }

    }
    @Override
    public String toString() {
        return "ID : " + super.getId() +
                "\nBalance : $" + super.getBalance() +
                "\nLimit  is $-" + this.overDraft;
    }

}
