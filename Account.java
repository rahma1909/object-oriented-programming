
package main.pkg3;


public class Account {
    private int accountno;
    private String name;
    private float amount;
    
    public void insert(int a,String n,float am){
        this.accountno=a;
        this.name=n;
        this.amount=am;  
    }
    public void despoist(float am){
        this.amount=this.amount+am;
        System.out.println(am+"deposited");
        
    }
    public void withdraw(float am){
   
        if(amount<am){
            System.out.println("can't be withdrawed");
            
        }else{
           this. amount=this.amount-am;
            System.out.println(am+"withdrawed");
    }
    }
    public void checkBalance(){
        System.out.println("amount :"+amount);
        
    }

    @Override
    public String toString() {
        return "Account{" + "accountno=" + accountno + ", name=" + name + ", amount=" + amount + '}';
    }
}
