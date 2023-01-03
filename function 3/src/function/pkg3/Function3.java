
package function.pkg3;
import java.util.Scanner;
// method of finding avarage of three numbers
public class Function3 {
 static float avg(float n1,float n2,float n3){
     float sum=n1+n2+n3;
    return sum/3;
}
   
    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
      int x,y,z;
      System.out.println("Enter #1 : ");
      x=input.nextInt();
       System.out.println("Enter #2 : ");
      y=input.nextInt();
       System.out.println("Enter #1 : ");
      z=input.nextInt();
      System.out.println(avg(x,y,z));
    }
    
}
