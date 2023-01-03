
package function.pkg2;
import java.util.Scanner;
//write java method that find the smallest among three numbers
public class Function2 {
    
    static int min(int n1,int n2,int n3){
       int minnumber=n1;
       if(minnumber>n2)
           minnumber= n2;
       if(minnumber>n3)
           minnumber= n3;
      
       return minnumber;
       
       
}

 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter #1: ");
        x=input.nextInt();
         System.out.println("Enter #2: ");
        y=input.nextInt();
         System.out.println("Enter #3: ");
        z=input.nextInt();
      System.out.println("min number "+min(x,y,z));
    }
    
}
