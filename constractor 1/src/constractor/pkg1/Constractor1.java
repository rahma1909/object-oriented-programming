
package constractor.pkg1;


public class Constractor1 {

    
    public static void main(String[] args) {
       constractor c1=new constractor();
       c1.display();
       constractor c2=new constractor("camera","auto foucs..",1200,20,2);
       c2.display();
       constractor c3=new  constractor("camera","auto foucs..",1200,20,2,"black");
       constractor c4=new constractor(c3);
       c4.display();
    }
}
    
