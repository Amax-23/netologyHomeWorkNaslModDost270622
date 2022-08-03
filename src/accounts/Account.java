package accounts;


public class Accounts {
    protected String name;
    protected long balance;

    public Accounts (String name, long balance){
        this.name = name;
        this.balance = balance;
    }


    public boolean pay(long amount){
        balance = balance - amount;
        if (balance - amount < 0){;
        return false;
        } else {
        return true;
        }
    }

    public boolean add(long amount){
        balance = balance + amount;
        if (balance + amount > 0) {
            return true;
        } else {
            return false;
        }
    }

    public  String toString(){
    return name + " " + balance;
    }


}
