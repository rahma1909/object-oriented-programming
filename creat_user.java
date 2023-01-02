
package project;


public class creat_user {
    private int account_number;
    private String name;
    int balance;
    
    public creat_user(){}
    public creat_user(int account_number, String name, int balance) {
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;
    }
   

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}

