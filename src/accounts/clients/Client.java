package clients;

import accounts.Account;


public class Client extends Account {
    protected int maxAccount;
    protected Account [] accounts;
    public Client(String name, long balance, Account [] accounts) {
        super(name, balance);
        this.accounts = accounts;

    }

    @Override
    public void add (Account account){
        for (int i = 0; i < accounts.length; i++){
            if (accounts [i] == null) {
                accounts[i] = account;
                System.out.println(account);
                System.out.println(accounts[i]);
                return;}

        } System.out.println("Мест для добавления нового счета нет! :(");

    }

}



