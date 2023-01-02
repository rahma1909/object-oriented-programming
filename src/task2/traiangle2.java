
package task2;


public class traiangle2 extends traiangle1 {
    
    public traiangle2(double a1,double a2,double a3){
    super(a1,a2,a3);
    }
    
    
    @Override
    public void check_angles (){
        if (a1==a2&&a2==a3&&a1+a2+a3==180)
            System.out.println("true");
        else
            System.out.println("false");
    }
    
}
