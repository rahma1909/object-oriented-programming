
package main.pkg3;


public class Main3 {

    
    public static void main(String[] args) {
        Account a1=new Account();
        a1.insert(1230, "ahmed", 150);
        a1.despoist(120);
        a1.withdraw(130);
        a1.checkBalance();
        System.out.println(a1.toString());
        
    }
    
}
