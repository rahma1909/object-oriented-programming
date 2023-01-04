
package car;


public class hatchback extends car1{
    public hatchback(int numberofwheels ,float height ,float weight){
        super(numberofwheels,height,weight);
    }
   
    

    @Override
    void autopilot() {
        System.out.println("autopilot");
    }
    @Override
    void streamingservices() {
        System.out.println("streamingservices");
    }
    @Override
    void pakingsinsors() {
         System.out.println(" pakingsinsors");
    }  
}
