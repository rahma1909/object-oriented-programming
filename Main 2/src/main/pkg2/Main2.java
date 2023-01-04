
package main.pkg2;


public class Main2 {

    
    public static void main(String[] args) {
       circle c1=new circle();
       circle c2=new circle();
      c1.setRedius(3.0);
      c1.setColor("Black");
      System.out.println(c1.getArea());
      c2.setRedius(2.0);
      c2.setColor("Blue");
      System.out.println(c2.getCircumference());
      System.out.println(c1.toString());
      System.out.println(c2.toString());
   
   
    } 
    
}
