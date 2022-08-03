import accounts.CheckingAccount;
import accounts.CreditAccounts;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Petya", 1000, 100);
        System.out.println(savingsAccount);
        System.out.println(savingsAccount.add(600));
        System.out.println(savingsAccount.pay(1500));

        CheckingAccount checkingAccount = new CheckingAccount("Vasya", 1000);
        System.out.println(checkingAccount + " " + checkingAccount.add(600) +
                " " + checkingAccount.pay(1600));



        CreditAccounts creditAccounts = new CreditAccounts("Kolya", -10000);
        System.out.println(creditAccounts);
        creditAccounts.add(1000);
        System.out.println(creditAccounts);
        checkingAccount.pay(500);
        System.out.println(creditAccounts);

    }
}