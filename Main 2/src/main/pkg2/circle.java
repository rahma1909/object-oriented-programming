
package main.pkg2;

public class circle {
    private double reduis;
    private String color;
    
    public void setRedius(double r){
        this.reduis=r;
        
    }
    public double getRedius(){
        return reduis;
    }
    public void setColor(String c){
        this.color =c;
        
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.PI *reduis*reduis;
    }
    public double getCircumference(){
        return Math.PI *2*reduis;
    }

    @Override
    public String toString() {
        return "circle{" + "reduis=" + reduis + ", color=" + color + '}';
    }
    
}
