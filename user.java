package project;
import java.util.Scanner;

public class user extends creat_user implements transactions{

    private  int amountofmoney;
    
    public user(int account_num, String name, int balance,int amountofmoney) {
        super(account_num, name, balance);
        this.amountofmoney=amountofmoney;
        
       
    }
    public user(){}
    
    public void checkaccountnum(){
        System.out.println("enter your account num");
        Scanner s= new Scanner(System.in);
       int account_number=s.nextInt();
//        int user_account_num = account_number;
       if(getAccount_number()==account_number){
           menu();
       }
       else
           System.out.println("enter your valid user num");
        
    }
    public void menu(){
        System.out.println("enter your choice:");
        System.out.println("1.check balance");
        System.out.println("2.desposit money");
        System.out.println("3.withdraw money");
        System.out.println("4.exit");
         Scanner s= new Scanner(System.in);
        int opt=s.nextInt();
        switch (opt) {
            case 1:
                checkbalance();
                break;
            case 2:
                desposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                break;
            default:
                break;
        }
       
        }
    public void checkbalance(){
        System.out.println(getBalance());
        
    }
    
    
    
    @Override
    public void desposit(){
        balance=balance+amountofmoney;
       // System.out.println("money desposited successfully");
         System.out.println(balance);
        
    }
    @Override
    public void withdraw(){
//        System.out.println("enter amount to withdraw");
//        if(amountofmoney>getBalance()){
//            System.out.println("lower balance");
//        }

            setBalance(getBalance()-amountofmoney);
          //  System.out.println("money withdrawl successfully");
            System.out.println(getBalance());
        
        
    }

    }


