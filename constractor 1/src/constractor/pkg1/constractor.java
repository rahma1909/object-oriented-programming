
package constractor.pkg1;

public class constractor {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;
    
     //no arg constractor
    public constractor(){
        this.name="no name";
        this.description="no discription";
        this.price=0.0f;
        this.quantity=0;
        this.discount=0;
  
    }
    //paramitrize constractor
   public  constractor(String n,String d,float p,int q,float dis){
        this.name=n;
        this.description=d;
        this.price=p;
        this.quantity=q;
        this.discount=dis;
        System.out.println("constractor 5 prameters");
        
        
    }
   //chaining
    public  constractor(String n,String d,float p,int q,float dis,String c){
        this(n,d,p,q,dis);
        this.color=c;
            System.out.println("constractor 6 prameters");
    }
    //copy constractor
    public constractor (constractor c3){
        this.name=c3.name;
        this.description=c3.description;
        this.price=c3.price;
        this.quantity=c3.quantity;
        this.discount=c3.discount;
        
        
    }
   
   
    public void display(){
        System.out.println("name : "+name);
        System.out.println("description :" +description);
        System.out.println("price: "+price);
        System.out.println("quantity : "+quantity );
        
        System.out.println("discount: "+discount);
        
      
        
    }
}
