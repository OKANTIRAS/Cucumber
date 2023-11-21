package week_11;

public class Question_11_03 {
    public static void main(String[] args) {


        CheckingAccount checkingAccount = new CheckingAccount(500, 11, 1450);
        SavingAccount savingAccount = new SavingAccount(16, 4820);

        System.out.println(checkingAccount);
        System.out.print("-----------------\n");
        System.out.println(savingAccount);

    }
}
