

package task1;


public class vehicle {
  protected double seating_cabacity;
// protected int fare_charge;
 
      public void set_seatcab(int seating_cab){
          this.seating_cabacity=seating_cab;
              
          
      }
  public void fare(){
      
      double fare;
      fare=seating_cabacity*100;
  }
}
