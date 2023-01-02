

package task1;

public class bus extends vehicle{
   
   public bus (double seat){
       this.seating_cabacity=seat;
   }

   
    @Override
    public void fare(){
      double x= ((seating_cabacity*100)*0.1);
      double fare=(seating_cabacity*100)+x;
        System.out.println(fare);
      
      
    
}

   
    
   
    
}
