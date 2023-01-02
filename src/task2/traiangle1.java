
package task2;


public class traiangle1 {
    double a1;
    double a2;
    double a3;
    
    
    public traiangle1(){}
    public traiangle1(double a1,double a2,double a3){
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
    }
    
    public void check_angles (){
        if (a1+a2+a3==180)
            System.out.println("true");
        else
            System.out.println("false");
    }
    
    
}
